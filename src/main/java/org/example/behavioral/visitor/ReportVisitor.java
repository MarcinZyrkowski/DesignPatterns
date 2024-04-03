package org.example.behavioral.visitor;

public interface ReportVisitor<R> {

    R visit(FixedPriceContract contract);

    R visit(TimeAndMaterialsContract contract);

    R visit(SupportContract contract);
}
