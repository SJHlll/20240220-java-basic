package etc.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // X에서 Y를 추출해 준다
    Y apply(X x);

}
