package com.sun.gluegen.runtime;

import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/gluegen/runtime/ProcAddressHelper")
public final class Class191 {

	// $FF: synthetic field
	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/ProcAddressHelper", name = "$assertionsDisabled", descriptor = "Z")
	private static final boolean aBoolean361 = !ProcAddressHelper.class.desiredAssertionStatus();

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/ProcAddressHelper", name = "resetProcAddressTable", descriptor = "(Ljava/lang/Object;Lgl!com/sun/gluegen/runtime/DynamicLookupHelper;)V")
	public static void method4430(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface7 arg1) throws RuntimeException {
		@Pc(2) Class local2 = arg0.getClass();
		@Pc(5) Field[] local5 = local2.getFields();
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(16) String local16 = local5[local7].getName();
			if (local16.startsWith("_addressof_")) {
				@Pc(24) int local24 = "_addressof_".length();
				@Pc(28) String local28 = local16.substring(local24);
				try {
					@Pc(32) Field local32 = local5[local7];
					if (!aBoolean361 && local32.getType() != Long.TYPE) {
						throw new AssertionError();
					}
					@Pc(46) long local46 = arg1.dynamicLookupFunction(local28);
					local32.setLong(arg0, local46);
				} catch (@Pc(52) Exception local52) {
					throw new RuntimeException("Can not get proc address for method \"" + local28 + "\": Couldn't set value of field \"" + local16 + "\" in class " + local2.getName(), local52);
				}
			}
		}
	}
}
