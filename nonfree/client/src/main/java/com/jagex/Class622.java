package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public class Class622 {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "[Lclient!asf;")
	static Class131_Sub2_Sub1_Sub1[] aClass131_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Ljava/util/List;")
	static List aList24;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Lclient!mn;")
	static Interface45 anInterface45_1;

	@OriginalMember(owner = "client!wl", name = "tm", descriptor = "B")
	public static byte aByte173;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
	static int anInt5631 = 0;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	static int anInt5633 = 0;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	static int anInt5638 = 0;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	static int anInt5632 = 0;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
	static int anInt5636 = 0;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	static int anInt5634 = 0;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "[Lclient!mc;")
	static Class395[] aClass395Array1 = new Class395[16];

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	static int anInt5635 = 0;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!aak;")
	static Class12 aClass12_38 = new Class12(16);

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!aak;")
	static Class12 aClass12_37 = new Class12(8);

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	static int anInt5630 = 0;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	static int anInt5637 = -513732962;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 29)
	Class622() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "(I)I", line = 34)
	static int method32420(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub40 local5 = (Class77_Sub40) aClass12_38.method173((long) arg0);
		if (local5 == null) {
			@Pc(12) Class395 local12 = anInterface45_1.method28446(arg0);
			if (local12 == null || local12.anInt4610 * 302557339 != 2) {
				return -1;
			}
			local5 = new Class77_Sub40(anInt5635 * 1254165885);
			aClass12_38.method184(local5, (long) arg0);
			aClass395Array1[(anInt5635 += 1391825877) * 1254165885 - 1] = local12;
		}
		return local5.anInt1786 * -705967177;
	}

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "(Lclient!mp;Lclient!mn;)V", line = 46)
	public static void method32421(@OriginalArg(0) Interface47 arg0, @OriginalArg(1) Interface45 arg1) {
		anInt5631 = 0;
		anInt5633 = 0;
		aList24 = new LinkedList();
		aClass131_Sub2_Sub1_Sub1Array1 = new Class131_Sub2_Sub1_Sub1[1024];
		OutputStream_Sub1.aClass626Array1 = new Class626[Class214.anIntArray351[anInt5637 * -1429983313] + 1];
		anInt5638 = 0;
		anInt5632 = 0;
		anInterface45_1 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(Lclient!dx;J)V", line = 57)
	public static void method32422(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		anInt5634 = anInt5636 * 407378687;
		anInt5636 = 0;
		Class280.method26667();
		@Pc(11) Iterator local11 = aList24.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class626 local18 = (Class626) local11.next();
			@Pc(23) boolean local23 = local18.method32509(arg0, arg1);
			if (!local23) {
				local11.remove();
				OutputStream_Sub1.aClass626Array1[anInt5632 * -2056179105] = local18;
				anInt5632 = (anInt5632 * -2056179105 + 1 & Class214.anIntArray351[-1429983313 * anInt5637]) * -80762465;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "(Lclient!dx;J)V", line = 57)
	public static void method32423(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		anInt5634 = anInt5636 * 407378687;
		anInt5636 = 0;
		Class280.method26667();
		@Pc(11) Iterator local11 = aList24.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class626 local18 = (Class626) local11.next();
			@Pc(23) boolean local23 = local18.method32509(arg0, arg1);
			if (!local23) {
				local11.remove();
				OutputStream_Sub1.aClass626Array1[anInt5632 * -2056179105] = local18;
				anInt5632 = (anInt5632 * -2056179105 + 1 & Class214.anIntArray351[-1429983313 * anInt5637]) * -80762465;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "(Lclient!dx;J)V", line = 57)
	public static void method32424(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		anInt5634 = anInt5636 * 407378687;
		anInt5636 = 0;
		Class280.method26667();
		@Pc(11) Iterator local11 = aList24.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class626 local18 = (Class626) local11.next();
			@Pc(23) boolean local23 = local18.method32509(arg0, arg1);
			if (!local23) {
				local11.remove();
				OutputStream_Sub1.aClass626Array1[anInt5632 * -2056179105] = local18;
				anInt5632 = (anInt5632 * -2056179105 + 1 & Class214.anIntArray351[-1429983313 * anInt5637]) * -80762465;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "(Lclient!tk;Lclient!dx;)V", line = 74)
	public static void method32425(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1) {
		@Pc(2) Iterator local2 = aList24.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class626 local9 = (Class626) local2.next();
			if (local9.aBoolean843) {
				local9.method32531(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "()V", line = 83)
	public static void method32426() {
		aClass12_37 = new Class12(8);
		anInt5630 = 0;
		@Pc(9) Iterator local9 = aList24.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class626 local16 = (Class626) local9.next();
			local16.method32501();
		}
	}

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "(I)V", line = 94)
	public static void method32427(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5637 = arg0 * -256866481;
		OutputStream_Sub1.aClass626Array1 = new Class626[Class214.anIntArray351[anInt5637 * -1429983313] + 1];
		anInt5638 = 0;
		anInt5632 = 0;
	}

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "(I)V", line = 94)
	public static void method32428(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5637 = arg0 * -256866481;
		OutputStream_Sub1.aClass626Array1 = new Class626[Class214.anIntArray351[anInt5637 * -1429983313] + 1];
		anInt5638 = 0;
		anInt5632 = 0;
	}

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "()I", line = 102)
	public static int method32429() {
		return anInt5637 * -1429983313;
	}

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "()I", line = 102)
	public static int method32430() {
		return anInt5637 * -1429983313;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "()I", line = 102)
	public static int method32431() {
		return anInt5637 * -1429983313;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)Lclient!zo;", line = 142)
	public static Class697 method32432() {
		return Class98.aClass697_2 == null ? Class697.aClass697_3 : Class98.aClass697_2;
	}

	@OriginalMember(owner = "client!wl", name = "adf", descriptor = "(Lclient!yf;I)V", line = 9736)
	static final void method32433(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anInt5784 -= 926998689;
		@Pc(27) int local27 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(37) int local37 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(47) int local47 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(53) Class17 local53 = Class367.aClass415_1.method28644(client.anInterface51_1, local37);
		@Pc(61) String local61 = local53.method311(local13, local27, Class148.aClass83Array6, local47);
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local61 == null ? "" : local61;
	}

	@OriginalMember(owner = "client!wl", name = "afx", descriptor = "(Lclient!yf;B)V", line = 10206)
	static final void method32434(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (client.anInt3466 * 365872613 == 0 && (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599)) {
			return;
		}
		@Pc(27) String local27 = local13.toLowerCase();
		@Pc(29) byte local29 = 0;
		if (local27.startsWith(Class44.aClass44_158.method713(Class667.aClass667_6))) {
			local29 = 0;
			local13 = local13.substring(Class44.aClass44_158.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_159.method713(Class667.aClass667_6))) {
			local29 = 1;
			local13 = local13.substring(Class44.aClass44_159.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_96.method713(Class667.aClass667_6))) {
			local29 = 2;
			local13 = local13.substring(Class44.aClass44_96.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_161.method713(Class667.aClass667_6))) {
			local29 = 3;
			local13 = local13.substring(Class44.aClass44_161.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_162.method713(Class667.aClass667_6))) {
			local29 = 4;
			local13 = local13.substring(Class44.aClass44_162.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_91.method713(Class667.aClass667_6))) {
			local29 = 5;
			local13 = local13.substring(Class44.aClass44_91.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_164.method713(Class667.aClass667_6))) {
			local29 = 6;
			local13 = local13.substring(Class44.aClass44_164.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_165.method713(Class667.aClass667_6))) {
			local29 = 7;
			local13 = local13.substring(Class44.aClass44_165.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_25.method713(Class667.aClass667_6))) {
			local29 = 8;
			local13 = local13.substring(Class44.aClass44_25.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_167.method713(Class667.aClass667_6))) {
			local29 = 9;
			local13 = local13.substring(Class44.aClass44_167.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_168.method713(Class667.aClass667_6))) {
			local29 = 10;
			local13 = local13.substring(Class44.aClass44_168.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_24.method713(Class667.aClass667_6))) {
			local29 = 11;
			local13 = local13.substring(Class44.aClass44_24.method713(Class667.aClass667_6).length());
		} else if (Class128.aClass667_3 != Class667.aClass667_6) {
			if (local27.startsWith(Class44.aClass44_158.method713(Class128.aClass667_3))) {
				local29 = 0;
				local13 = local13.substring(Class44.aClass44_158.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_159.method713(Class128.aClass667_3))) {
				local29 = 1;
				local13 = local13.substring(Class44.aClass44_159.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_96.method713(Class128.aClass667_3))) {
				local29 = 2;
				local13 = local13.substring(Class44.aClass44_96.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_161.method713(Class128.aClass667_3))) {
				local29 = 3;
				local13 = local13.substring(Class44.aClass44_161.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_162.method713(Class128.aClass667_3))) {
				local29 = 4;
				local13 = local13.substring(Class44.aClass44_162.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_91.method713(Class128.aClass667_3))) {
				local29 = 5;
				local13 = local13.substring(Class44.aClass44_91.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_164.method713(Class128.aClass667_3))) {
				local29 = 6;
				local13 = local13.substring(Class44.aClass44_164.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_165.method713(Class128.aClass667_3))) {
				local29 = 7;
				local13 = local13.substring(Class44.aClass44_165.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_25.method713(Class128.aClass667_3))) {
				local29 = 8;
				local13 = local13.substring(Class44.aClass44_25.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_167.method713(Class128.aClass667_3))) {
				local29 = 9;
				local13 = local13.substring(Class44.aClass44_167.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_168.method713(Class128.aClass667_3))) {
				local29 = 10;
				local13 = local13.substring(Class44.aClass44_168.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_24.method713(Class128.aClass667_3))) {
				local29 = 11;
				local13 = local13.substring(Class44.aClass44_24.method713(Class128.aClass667_3).length());
			}
		}
		local27 = local13.toLowerCase();
		@Pc(468) byte local468 = 0;
		if (local27.startsWith(Class44.aClass44_170.method713(Class667.aClass667_6))) {
			local468 = 1;
			local13 = local13.substring(Class44.aClass44_170.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_101.method713(Class667.aClass667_6))) {
			local468 = 2;
			local13 = local13.substring(Class44.aClass44_101.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_172.method713(Class667.aClass667_6))) {
			local468 = 3;
			local13 = local13.substring(Class44.aClass44_172.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_173.method713(Class667.aClass667_6))) {
			local468 = 4;
			local13 = local13.substring(Class44.aClass44_173.method713(Class667.aClass667_6).length());
		} else if (local27.startsWith(Class44.aClass44_166.method713(Class667.aClass667_6))) {
			local468 = 5;
			local13 = local13.substring(Class44.aClass44_166.method713(Class667.aClass667_6).length());
		} else if (Class128.aClass667_3 != Class667.aClass667_6) {
			if (local27.startsWith(Class44.aClass44_170.method713(Class128.aClass667_3))) {
				local468 = 1;
				local13 = local13.substring(Class44.aClass44_170.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_101.method713(Class128.aClass667_3))) {
				local468 = 2;
				local13 = local13.substring(Class44.aClass44_101.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_172.method713(Class128.aClass667_3))) {
				local468 = 3;
				local13 = local13.substring(Class44.aClass44_172.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_173.method713(Class128.aClass667_3))) {
				local468 = 4;
				local13 = local13.substring(Class44.aClass44_173.method713(Class128.aClass667_3).length());
			} else if (local27.startsWith(Class44.aClass44_166.method713(Class128.aClass667_3))) {
				local468 = 5;
				local13 = local13.substring(Class44.aClass44_166.method713(Class128.aClass667_3).length());
			}
		}
		@Pc(653) Class82 local653 = Class230.method25826();
		@Pc(659) Class77_Sub20 local659 = Class365.method28132(Class414.aClass414_95, local653.aClass16_1);
		local659.aClass77_Sub39_Sub1_2.method22403(0);
		@Pc(670) int local670 = local659.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local659.aClass77_Sub39_Sub1_2.method22403(local29);
		local659.aClass77_Sub39_Sub1_2.method22403(local468);
		Class218.method25709(local659.aClass77_Sub39_Sub1_2, local13);
		local659.aClass77_Sub39_Sub1_2.method22463(local659.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local670);
		local653.method2004(local659);
	}

	@OriginalMember(owner = "client!wl", name = "ala", descriptor = "(Lclient!yf;Lclient!agh;I)V", line = 11516)
	static final void method32435(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class104_Sub1_Sub1_Sub1 arg1) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(48) boolean local48 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] == 1;
		if (Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_4) {
			throw new RuntimeException();
		}
		@Pc(62) Class149_Sub4 local62 = (Class149_Sub4) Class597.aClass107_Sub1_2.method8873();
		if (arg1 != null) {
			local62.method16841(arg1, new Class447((float) local13, (float) local23, (float) local33), local48);
		}
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!wl", name = "lm", descriptor = "(Lclient!gm;I)Lclient!gm;", line = 11780)
	static Class277 method32436(@OriginalArg(0) Class277 arg0) {
		@Pc(2) Class277 local2 = client.method25377(arg0);
		if (local2 == null) {
			local2 = arg0.aClass277_11;
		}
		return local2;
	}

	@OriginalMember(owner = "client!wl", name = "axh", descriptor = "(Lclient!yf;B)V", line = 13355)
	static final void method32437(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!wl", name = "azy", descriptor = "(Lclient!yf;B)V", line = 13756)
	static final void method32438(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) Integer local43 = (Integer) client.aClass248_1.method26141(local13).method26448(local23, local33);
		if (local43 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local43;
		}
	}
}
