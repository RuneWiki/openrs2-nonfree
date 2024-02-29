package com.jagex;

import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public class Class637 {

	@OriginalMember(owner = "client!xa", name = "ey", descriptor = "Ljava/net/Socket;")
	static Socket aSocket2;

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "Lclient!lj;")
	static Class117 aClass117_6 = null;

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "()V", line = 19)
	Class637() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xa", name = "x", descriptor = "(Lclient!xo;)V", line = 24)
	public static void method32693(@OriginalArg(0) Class650 arg0) {
		if (arg0.aClass386_3 == Class386.aClass386_2) {
			aClass117_6 = new Class117_Sub1(arg0);
		} else if (arg0.aClass386_3 == Class386.aClass386_1) {
			aClass117_6 = new Class117_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "(Lclient!xo;)V", line = 24)
	public static void method32694(@OriginalArg(0) Class650 arg0) {
		if (arg0.aClass386_3 == Class386.aClass386_2) {
			aClass117_6 = new Class117_Sub1(arg0);
		} else if (arg0.aClass386_3 == Class386.aClass386_1) {
			aClass117_6 = new Class117_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "(Lclient!xo;)V", line = 24)
	public static void method32695(@OriginalArg(0) Class650 arg0) {
		if (arg0.aClass386_3 == Class386.aClass386_2) {
			aClass117_6 = new Class117_Sub1(arg0);
		} else if (arg0.aClass386_3 == Class386.aClass386_1) {
			aClass117_6 = new Class117_Sub2(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xa", name = "r", descriptor = "()V", line = 30)
	public static void method32696() {
		if (aClass117_6 != null) {
			aClass117_6.method10881();
			aClass117_6 = null;
		}
	}

	@OriginalMember(owner = "client!xa", name = "g", descriptor = "()V", line = 30)
	public static void method32697() {
		if (aClass117_6 != null) {
			aClass117_6.method10881();
			aClass117_6 = null;
		}
	}

	@OriginalMember(owner = "client!xa", name = "z", descriptor = "()V", line = 30)
	public static void method32698() {
		if (aClass117_6 != null) {
			aClass117_6.method10881();
			aClass117_6 = null;
		}
	}

	@OriginalMember(owner = "client!xa", name = "s", descriptor = "()V", line = 30)
	public static void method32699() {
		if (aClass117_6 != null) {
			aClass117_6.method10881();
			aClass117_6 = null;
		}
	}

	@OriginalMember(owner = "client!xa", name = "j", descriptor = "(Lclient!pw;ILclient!vf;ZLclient!er;)Lclient!vg;", line = 41)
	public static Interface69 method32700(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class232 arg4) {
		if (aClass117_6 == null) {
			return null;
		} else {
			return (Interface69) (arg3 ? new Class598(arg0, arg1, aClass117_6, arg2) : new Class610(arg0, arg1, aClass117_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!xa", name = "k", descriptor = "(IIFLclient!li;)V", line = 49)
	public static void method32701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface41 arg3) {
		if (aClass117_6 != null) {
			aClass117_6.method10880().method28304(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!xa", name = "i", descriptor = "(IIFLclient!li;)V", line = 49)
	public static void method32702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface41 arg3) {
		if (aClass117_6 != null) {
			aClass117_6.method10880().method28304(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(IIFLclient!li;)V", line = 49)
	public static void method32703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface41 arg3) {
		if (aClass117_6 != null) {
			aClass117_6.method10880().method28304(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "(I)Lclient!mh;", line = 53)
	public static Class399 method32704(@OriginalArg(0) int arg0) {
		return aClass117_6 == null ? null : aClass117_6.method10880().method28306(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "f", descriptor = "(I)Lclient!mh;", line = 53)
	public static Class399 method32705(@OriginalArg(0) int arg0) {
		return aClass117_6 == null ? null : aClass117_6.method10880().method28306(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "e", descriptor = "(I)Lclient!mh;", line = 53)
	public static Class399 method32706(@OriginalArg(0) int arg0) {
		return aClass117_6 == null ? null : aClass117_6.method10880().method28306(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "(I)Lclient!mh;", line = 53)
	public static Class399 method32707(@OriginalArg(0) int arg0) {
		return aClass117_6 == null ? null : aClass117_6.method10880().method28306(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "o", descriptor = "(I)Lclient!mh;", line = 53)
	public static Class399 method32708(@OriginalArg(0) int arg0) {
		return aClass117_6 == null ? null : aClass117_6.method10880().method28306(arg0);
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(II)Z", line = 58)
	public static boolean method32709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aClass117_6 == null || aClass117_6.method10880() == null) {
			return false;
		} else if (arg1 == arg0) {
			return true;
		} else {
			@Pc(19) Class399 local19 = aClass117_6.method10880().method28306(arg0);
			@Pc(26) Class399 local26 = aClass117_6.method10880().method28306(arg1);
			@Pc(28) Class399 local28 = local19;
			do {
				if (local28 == null) {
					local28 = local26;
					do {
						if (local28 == null) {
							return false;
						}
						local28 = local28.method28474();
						if (local28 == local19) {
							return true;
						}
					} while (local26 != local28);
					return false;
				}
				local28 = local28.method28474();
				if (local26 == local28) {
					return true;
				}
			} while (local19 != local28);
			return false;
		}
	}

	@OriginalMember(owner = "client!xa", name = "aax", descriptor = "(Lclient!yf;I)V", line = 9274)
	static final void method32710(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.anInt4554 * -1394878511;
	}

	@OriginalMember(owner = "client!xa", name = "acn", descriptor = "(Lclient!yf;B)V", line = 9657)
	static final void method32711(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class424.anIntArray462[local12 & 0xFFFF];
	}

	@OriginalMember(owner = "client!xa", name = "amb", descriptor = "(Lclient!yf;I)V", line = 11697)
	static final void method32712(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_4 || Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_4) {
			throw new RuntimeException();
		}
		@Pc(31) Class115_Sub1 local31 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
		@Pc(36) Class149_Sub4 local36 = (Class149_Sub4) Class597.aClass107_Sub1_2.method8873();
		@Pc(40) Class447 local40 = local31.method9855();
		@Pc(43) Class447 local43 = Class447.method29124(local40);
		local43.aFloat276 += local12;
		@Pc(56) Class447 local56 = Class447.method29160(local36.method23153(), local43);
		local56.method29145();
		@Pc(63) float local63 = local31.method9858().method29170();
		Class444.method29096(local36.method23153(), local56, local40, local63, Class674.aClass447Array3);
		@Pc(73) Class447 local73 = null;
		if (Class674.aClass447Array3[0] == null) {
			throw new RuntimeException("");
		}
		if (Class674.aClass447Array3[1] == null) {
			local73 = Class674.aClass447Array3[0];
		} else if (Class447.method29160(local36.method23153(), Class674.aClass447Array3[0]).method29170() < Class447.method29160(local36.method23153(), Class674.aClass447Array3[1]).method29170()) {
			local73 = Class674.aClass447Array3[1];
		} else {
			local73 = Class674.aClass447Array3[0];
		}
		@Pc(132) float local132 = Class462.method29537(local40.aFloat277 - local73.aFloat277, local40.aFloat278 - local73.aFloat278);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((double) local132 * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!xa", name = "ara", descriptor = "(Lclient!yf;I)V", line = 12467)
	static final void method32713(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_5.method15901();
	}
}
