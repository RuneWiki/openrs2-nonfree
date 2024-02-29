package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public class Class230 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "[Lclient!es;")
	static Class233[] aClass233Array1;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "S")
	static short aShort165;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!zm;")
	public static Class695 aClass695_49 = new Class695();

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Lclient!aak;")
	public static Class12 aClass12_24 = new Class12(32);

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
	static int anInt3761 = -213444879;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
	static int anInt3758 = 0;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	static int anInt3757 = 0;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "Z")
	static boolean aBoolean645 = false;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	static int anInt3760 = -683420367;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	static int anInt3759 = -2070289217;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!cu;")
	public static final Interface19 anInterface19_3 = new Class221();

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V", line = 53)
	Class230() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "()V", line = 137)
	public static void method25821() {
		aClass12_24.method188();
		aClass695_49.method36380();
		aClass233Array1 = null;
		Class589.aClass222Array1 = null;
		Class128_Sub1.aClass225Array1 = null;
		Class372.aClass237Array1 = null;
		Class695.aClass96Array1 = null;
		anInt3761 = -213444879;
		anInt3758 = 0;
		anInt3757 = 0;
		Class661.aClass231_4 = null;
		anInt3759 = -2070289217;
		anInt3760 = -683420367;
		if (!aBoolean645) {
			return;
		}
		client.aShort160 = Class240.aShort166;
		client.aShort161 = Class85.aShort12;
		client.aShort158 = Class96_Sub10.aShort24;
		client.aShort159 = aShort165;
		aBoolean645 = false;
	}

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "()V", line = 160)
	public static void method25822() {
		Class240.aShort166 = client.aShort160;
		Class85.aShort12 = client.aShort161;
		Class96_Sub10.aShort24 = client.aShort158;
		aShort165 = client.aShort159;
		aBoolean645 = true;
		anInt3760 = Class94_Sub4.aClass261_1.method26341() * 683420367;
		if (anInt3757 * 1103230549 != 0 && anInt3758 * 1532234787 != 0) {
			client.aShort158 = 334;
			client.aShort159 = 334;
			client.aShort161 = client.aShort160 = (short) (anInt3757 * -2081641984 / (anInt3758 * 1532234787));
		}
	}

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "()V", line = 160)
	public static void method25823() {
		Class240.aShort166 = client.aShort160;
		Class85.aShort12 = client.aShort161;
		Class96_Sub10.aShort24 = client.aShort158;
		aShort165 = client.aShort159;
		aBoolean645 = true;
		anInt3760 = Class94_Sub4.aClass261_1.method26341() * 683420367;
		if (anInt3757 * 1103230549 != 0 && anInt3758 * 1532234787 != 0) {
			client.aShort158 = 334;
			client.aShort159 = 334;
			client.aShort161 = client.aShort160 = (short) (anInt3757 * -2081641984 / (anInt3758 * 1532234787));
		}
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(Z)V", line = 174)
	public static void method25824(@OriginalArg(0) boolean arg0) {
		if (client.anInt3443 * -1468443459 == 4 || client.anInt3443 * -1468443459 == 1) {
			return;
		}
		if (!arg0) {
			if (Class695.aClass96Array1 != null) {
				@Pc(16) Class96[] local16 = Class695.aClass96Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class96 local26 = local16[local18];
					local26.method19901();
				}
			}
			if (anInt3760 * -1908237265 != -1) {
				Class94_Sub4.aClass261_1.method26354(anInt3760 * -1908237265, 255);
			}
		}
		client.anInt3443 = -575071660;
		Class705.aClass77_Sub39_17 = null;
		client.aBoolean607 = false;
		if (anInt3759 * 1689023681 > 0) {
			Class675.method35962(Class135.aClass135_41, anInt3759 * 1689023681, -1);
		}
		Class93_Sub1.method6436();
		@Pc(68) Class77_Sub20 local68 = Class365.method28132(Class414.aClass414_94, client.aClass82_2.aClass16_1);
		local68.aClass77_Sub39_Sub1_2.method22403(arg0 ? 1 : 0);
		client.aClass82_2.method2004(local68);
	}

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "(Z)V", line = 174)
	public static void method25825(@OriginalArg(0) boolean arg0) {
		if (client.anInt3443 * -1468443459 == 4 || client.anInt3443 * -1468443459 == 1) {
			return;
		}
		if (!arg0) {
			if (Class695.aClass96Array1 != null) {
				@Pc(16) Class96[] local16 = Class695.aClass96Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class96 local26 = local16[local18];
					local26.method19901();
				}
			}
			if (anInt3760 * -1908237265 != -1) {
				Class94_Sub4.aClass261_1.method26354(anInt3760 * -1908237265, 255);
			}
		}
		client.anInt3443 = -575071660;
		Class705.aClass77_Sub39_17 = null;
		client.aBoolean607 = false;
		if (anInt3759 * 1689023681 > 0) {
			Class675.method35962(Class135.aClass135_41, anInt3759 * 1689023681, -1);
		}
		Class93_Sub1.method6436();
		@Pc(68) Class77_Sub20 local68 = Class365.method28132(Class414.aClass414_94, client.aClass82_2.aClass16_1);
		local68.aClass77_Sub39_Sub1_2.method22403(arg0 ? 1 : 0);
		client.aClass82_2.method2004(local68);
	}

	@OriginalMember(owner = "client!ep", name = "fe", descriptor = "(I)Lclient!ae;", line = 1986)
	public static Class82 method25826() {
		return Class222.method25761(client.anInt3390 * -1850530127) || client.anInt3390 * -1850530127 == 18 ? client.aClass82_1 : client.aClass82_2;
	}

	@OriginalMember(owner = "client!ep", name = "qu", descriptor = "(Lclient!yf;B)V", line = 7448)
	static final void method25827(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3879 * -488164841;
	}
}
