package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public class Class338 {

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "[Lclient!vv;")
	static Class606[] aClass606Array1;

	@OriginalMember(owner = "client!ja", name = "gr", descriptor = "Lclient!pw;")
	public static Class478 aClass478_97;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Ljava/lang/String;")
	final String aString205;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Ljava/lang/String;")
	final String aString203;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Ljava/lang/String;")
	final String aString204;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 8)
	Class338(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString205 = arg0;
		this.aString203 = arg1;
		this.aString204 = arg2;
	}

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "(Ljava/lang/Iterable;B)I", line = 62)
	static int method27695(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method36479() > local1) {
				local1 = local11.method36479();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 322)
	static String method27696(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		@Pc(22) int local22 = -1;
		if (arg0.startsWith("directlogin ")) {
			local22 = arg0.indexOf(" ", "directlogin ".length());
		}
		if (local22 >= 0) {
			@Pc(37) int local37 = arg0.length();
			arg0 = arg0.substring(0, local22) + " ";
			for (@Pc(53) int local53 = local22 + 1; local53 < local37; local53++) {
				arg0 = arg0 + "*";
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!ja", name = "ni", descriptor = "(Lclient!yf;I)V", line = 7010)
	static final void method27697(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class131.method23062(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "ajx", descriptor = "(Lclient!yf;S)V", line = 11071)
	static final void method27698(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194();
	}

	@OriginalMember(owner = "client!ja", name = "aoj", descriptor = "(Lclient!yf;I)V", line = 12019)
	static final void method27699(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class231.method25828() ? 1 : 0;
	}
}
