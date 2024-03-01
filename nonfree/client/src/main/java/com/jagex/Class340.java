package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public class Class340 {

	@OriginalMember(owner = "client!nb", name = "cn", descriptor = "Lclient!yx;")
	static Class611 aClass611_10;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!nb;")
	public static final Class340 aClass340_7 = new Class340(0);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!nb;")
	public static final Class340 aClass340_2 = new Class340(1);

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!nb;")
	public static final Class340 aClass340_3 = new Class340(2);

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!nb;")
	public static final Class340 aClass340_4 = new Class340(3);

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!nb;")
	public static final Class340 aClass340_6 = new Class340(4);

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!nb;")
	static final Class340 aClass340_5 = new Class340(5);

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!nb;")
	static final Class340 aClass340_1 = new Class340(6);

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!nb;")
	static final Class340 aClass340_9 = new Class340(7);

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!nb;")
	static final Class340 aClass340_8 = new Class340(8);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public final int anInt4602;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V", line = 15)
	Class340(@OriginalArg(0) int arg0) {
		this.anInt4602 = arg0 * -760754249;
	}

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "(B)V", line = 18)
	public static void method26439() {
		Class512.aClass153_1.method23148();
	}

	@OriginalMember(owner = "client!nb", name = "ef", descriptor = "(I)Lclient!agk;", line = 842)
	public static Class3_Sub26 method26441() {
		if (Class58_Sub1.aClass553_23 == null || Class58_Sub1.aClass554_1 == null) {
			return null;
		}
		for (@Pc(9) Class3_Sub26 local9 = (Class3_Sub26) Class58_Sub1.aClass554_1.next(); local9 != null; local9 = (Class3_Sub26) Class58_Sub1.aClass554_1.next()) {
			@Pc(19) Class452 local19 = Class58_Sub1.aClass454_2.method28448(local9.anInt1304 * 1865552421);
			if (local19 != null && local19.aBoolean776 && local19.method28402(Class58_Sub1.anInterface9_2, Class58_Sub1.anInterface8_2)) {
				return local9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nb", name = "ba", descriptor = "(IIB)Ljava/lang/String;", line = 1607)
	static String method26440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 - arg0;
		if (local3 < -9) {
			return Class271.method25310(16711680);
		} else if (local3 < -6) {
			return Class271.method25310(16723968);
		} else if (local3 < -3) {
			return Class271.method25310(16740352);
		} else if (local3 < 0) {
			return Class271.method25310(16756736);
		} else if (local3 > 9) {
			return Class271.method25310(65280);
		} else if (local3 > 6) {
			return Class271.method25310(4259584);
		} else if (local3 > 3) {
			return Class271.method25310(8453888);
		} else if (local3 > 0) {
			return Class271.method25310(12648192);
		} else {
			return Class271.method25310(16776960);
		}
	}
}
