package nl.nberlijn.powercontrol.log;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("com.nberlijn.nl.nberlijn.powercontrol.nl.nberlijn.nl.nberlijn.powercontrol.log.Log")
public class AnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();

        for (TypeElement typeElement : annotations) {
            for (Element element : roundEnv.getElementsAnnotatedWith(typeElement)) {
                messager.printMessage(Diagnostic.Kind.NOTE, "Printing: " + element.toString());
            }
        }

        return true;
    }

}
