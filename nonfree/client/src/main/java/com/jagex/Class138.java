package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public class Class138 implements Interface75 {

	@OriginalMember(owner = "client!qe", name = "cu", descriptor = "I")
	public static int anInt1383;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_65 = new Class138_Sub1(Class667.aClass667_78, 0, true, true);

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_67 = new Class138_Sub5(Class667.aClass667_87, 1, false, true);

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_63 = new Class138_Sub4(Class667.aClass667_88, 2, true, true);

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!qe;")
	static final Class138 aClass138_64 = new Class138_Sub3(Class667.aClass667_89, 3, false, false);

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!qe;")
	static final Class138 aClass138_66 = new Class138(Class667.aClass667_90, 4, false, false);

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_72 = new Class138(Class667.aClass667_105, 5, true, true);

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_71 = new Class138(Class667.aClass667_94, 6, true, true);

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_68 = new Class138(Class667.aClass667_91, 7, true, false);

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Lclient!qe;")
	static final Class138 aClass138_69 = new Class138_Sub2(Class667.aClass667_93, 8, false, false);

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!qe;")
	public static final Class138 aClass138_70 = new Class138(Class667.aClass667_80, 9, false, true);

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!qe;")
	static final Class138 aClass138_62 = new Class138(Class667.aClass667_107, 10, false, false);

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!xq;")
	final Class667 aClass667_8;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	final int anInt1382;

	// $FF: synthetic method
	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!xq;IZZLclient!aib;)V", line = 22)
	Class138(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class138_Sub1 arg4) {
		this(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()[Lclient!qe;", line = 63)
	public static Class138[] method11520() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "()[Lclient!qe;", line = 63)
	public static Class138[] method11525() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[Lclient!qe;", line = 63)
	public static Class138[] method11526() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "()[Lclient!qe;", line = 63)
	public static Class138[] method11527() {
		return new Class138[] { aClass138_70, aClass138_68, aClass138_69, aClass138_62, aClass138_65, aClass138_63, aClass138_66, aClass138_72, aClass138_64, aClass138_67, aClass138_71 };
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!xq;IZZ)V", line = 66)
	Class138(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.aClass667_8 = arg0;
		this.anInt1382 = arg1 * -1097325223;
	}

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "(B)Lclient!xq;", line = 72)
	public final Class667 method11528() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lclient!xq;", line = 72)
	public final Class667 method11529() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "()Lclient!xq;", line = 72)
	public final Class667 method11530() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "()Lclient!xq;", line = 72)
	public final Class667 method11531() {
		return this.aClass667_8;
	}

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "()I", line = 76)
	@Override
	public int method36920() {
		return this.anInt1382 * 2090586857;
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "()I", line = 76)
	@Override
	public int method36919() {
		return this.anInt1382 * 2090586857;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(Lclient!ec;B)Ljava/lang/Object;", line = 80)
	public Object method11521(@OriginalArg(0) Class108 arg0) {
		return arg0.aBoolean173 ? this.method11522(arg0) : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 80)
	public Object method11532(@OriginalArg(0) Class108 arg0) {
		return arg0.aBoolean173 ? this.method11522(arg0) : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 80)
	public Object method11533(@OriginalArg(0) Class108 arg0) {
		return arg0.aBoolean173 ? this.method11522(arg0) : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;", line = 85)
	Object method11522(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 85)
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 85)
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "(IZB)V", line = 145)
	static void method11538(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31065(arg0, arg1);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray173.length; local10++) {
			local4.anIntArray173[local10] = -1;
			local4.anIntArray174[local10] = 0;
		}
		local4.aClass40Array1 = null;
	}

	@OriginalMember(owner = "client!qe", name = "eq", descriptor = "(ZI)V", line = 1931)
	public static void method11537(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (client.anInt3526 * -703563959 != -1) {
				Class535.method30753(client.anInt3526 * -703563959);
			}
			for (@Pc(16) Class93_Sub40 local16 = (Class93_Sub40) client.aClass16_22.method220(); local16 != null; local16 = (Class93_Sub40) client.aClass16_22.method222()) {
				if (!local16.method23970()) {
					local16 = (Class93_Sub40) client.aClass16_22.method220();
					if (local16 == null) {
						break;
					}
				}
				Class372.method28019(local16, true, false);
			}
			client.anInt3526 = -823798521;
			client.aClass16_22 = new Class16(8);
			Class361.method27802();
			client.anInt3526 = Class93_Sub26.aClass645_15.anInt5766 * 1630912889;
			if (client.anInt3526 * -703563959 != -1) {
				Class618.method32101(false);
				Class635.method32441();
				Class56.method18036(client.anInt3526 * -703563959, null);
			}
		}
		Class692.method36598();
		Class65.aClass123_Sub1_2.method8923(true);
		Class411.aBoolean752 = false;
		Class548.method31013();
		client.anInt3520 = 410366683;
		Class696.method36650(client.anInt3555 * 225035861);
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 = new Class132_Sub1_Sub1_Sub1_Sub2(null);
		client.aMap18.clear();
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24231((float) (client.aClass532_1.method30444() * 512 / 2), 0.0F, (float) (client.aClass532_1.method30474() * 512 / 2));
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] = client.aClass532_1.method30444() / 2;
		Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] = client.aClass532_1.method30474() / 2;
		Class270.anInt3884 = 0;
		Class163.anInt2002 = 0;
		if (Class429.anInt4781 * -1453926679 == 5) {
			Class163.anInt2002 = (Class26.anInt90 * -877893825 << 9) * 1636217271;
			Class270.anInt3884 = (Class20.anInt70 * 390649993 << 9) * -967471741;
		} else {
			Class631.method32283();
		}
		client.aClass532_1.method30532().method33003();
	}

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "(ZLclient!yf;B)V", line = 5159)
	static final void method11534(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class681 arg1) {
		@Pc(12) int local12 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		if (arg0) {
			Class240.method25871(local22, local16);
		} else {
			Class337.method27460(local22, local16);
		}
	}

	@OriginalMember(owner = "client!qe", name = "vm", descriptor = "(Lclient!yf;I)V", line = 8835)
	static final void method11536(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(32) Class677 local32 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		Class125_Sub1.method9215(local32.aClass312_13, local13, local23);
	}

	@OriginalMember(owner = "client!qe", name = "ali", descriptor = "(Lclient!yf;B)V", line = 11788)
	static final void method11539(@OriginalArg(0) Class681 arg0) {
		Class373.method28022();
	}

	@OriginalMember(owner = "client!qe", name = "aoa", descriptor = "(Lclient!yf;I)V", line = 12587)
	static final void method11535(@OriginalArg(0) Class681 arg0) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(18) boolean local18 = arg0.anIntArray519[arg0.anInt5891 * -1497248091] == 1;
		@Pc(33) boolean local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		Class65.aClass123_Sub1_2.method8943(local18, local33);
	}
}
