package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agn")
public class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!agn", name = "l", descriptor = "Ljava/lang/Object;")
	public final Object anObject2;

	@OriginalMember(owner = "client!agn", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 6)
	public Class3_Sub29(@OriginalArg(0) Object arg0) {
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!agn", name = "u", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 151)
	public static void method11606(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg0.length() <= 320 && Class404.method27638()) {
			Class381.method27304();
			Class190.aString178 = arg0;
			Class190.aString179 = arg1;
			Class166.method23342(15);
		}
	}
}
