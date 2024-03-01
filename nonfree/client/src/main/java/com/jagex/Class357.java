package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public class Class357 {

	@OriginalMember(owner = "client!nu", name = "sy", descriptor = "Lclient!iu;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!nu", name = "nc", descriptor = "I")
	public static int anInt4639;

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "Lclient!nu;")
	static final Class357 aClass357_6 = new Class357(0, false);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "Lclient!nu;")
	public static final Class357 aClass357_2 = new Class357(1, false);

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "Lclient!nu;")
	static final Class357 aClass357_3 = new Class357(2, false);

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "Lclient!nu;")
	static final Class357 aClass357_5 = new Class357(3, false);

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Lclient!nu;")
	static final Class357 aClass357_4 = new Class357(4, false);

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "Lclient!nu;")
	static final Class357 aClass357_1 = new Class357(5, true);

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "Lclient!nu;")
	static final Class357 aClass357_9 = new Class357(6, true);

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "Lclient!nu;")
	static final Class357 aClass357_7 = new Class357(7, true);

	@OriginalMember(owner = "client!nu", name = "y", descriptor = "Lclient!nu;")
	static final Class357 aClass357_8 = new Class357(8, true);

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	final int anInt4638;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Z")
	public final boolean aBoolean722;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IZ)V", line = 17)
	Class357(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4638 = arg0 * 407113039;
		this.aBoolean722 = arg1;
	}

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "(S)Z", line = 99)
	static boolean method26657() {
		try {
			@Pc(3) Class622 local3 = new Class622();
			@Pc(8) byte[] local8 = local3.method33761(Class227.aByteArray73);
			Class107.method21920(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}
}
