package JAVA17;

/**
 * sealed feature
 * will seal which classes/interface are allowed to inherit sealed class/interface
 * NOTE: child class/interface needs to be final,sealed or non-sealed -->interface cannot be final
 */
public sealed class SealedExample permits A, B, C {

}

sealed class A extends SealedExample permits D {

}

non-sealed class B extends SealedExample {

}

final class C extends SealedExample {

}

non-sealed class D extends A implements B1 {

}

//for interfaces

sealed interface A1 permits B1, C1 {
}

sealed interface B1 extends A1 permits D {
}

non-sealed interface C1 extends A1 {
}
