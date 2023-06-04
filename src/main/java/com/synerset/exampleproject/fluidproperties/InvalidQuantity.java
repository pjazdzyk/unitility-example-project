package com.synerset.exampleproject.fluidproperties;

import com.synerset.unitility.unitsystem.PhysicalQuantity;

public record InvalidQuantity(String msg, PhysicalQuantity<?>... inputArguments) {}