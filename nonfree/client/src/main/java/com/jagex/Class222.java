package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class222 {

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	static final int anInt3743 = 25;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[Lclient!aew;")
	static Class89_Sub2[] aClass89_Sub2Array1;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
	int[] anIntArray364;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Z")
	public boolean aBoolean643 = false;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "Lclient!apo;")
	Class104_Sub1_Sub1_Sub1_Sub1 aClass104_Sub1_Sub1_Sub1_Sub1_2 = null;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!apv;")
	Class104_Sub1_Sub1_Sub1_Sub2 aClass104_Sub1_Sub1_Sub1_Sub2_2 = null;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	final int anInt3741;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	public final int anInt3742;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!akv;I)V", line = 21)
	Class222(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.anInt3741 = arg1 * 1274430477;
		@Pc(19) int local19 = arg0.method22478();
		switch(local19) {
			case 0:
				this.anInt3742 = arg0.method22549() * -1795554127;
				break;
			case 1:
				this.anInt3742 = 1795554127;
				break;
			default:
				this.anInt3742 = 1795554127;
		}
		arg0.method22523();
	}

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "(IIIIB)V", line = 39)
	void method25743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean643) {
			this.aBoolean643 = true;
			if (this.anInt3742 * -849492911 >= 0) {
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = new Class104_Sub1_Sub1_Sub1_Sub1(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19810((Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911));
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21092(this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4117 * -1821838479);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2897 = (this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4112 * -1373680215 << 3) * 1883849079;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			} else {
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21163(Class705.aClass77_Sub39_17);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			}
		}
		if (this.anInt3742 * -849492911 >= 0) {
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19822(arg2, arg0, arg1, true, this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21095());
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21070(arg3, true);
		} else {
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21186(arg0, arg1);
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21070(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "(IIII)V", line = 39)
	void method25744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean643) {
			this.aBoolean643 = true;
			if (this.anInt3742 * -849492911 >= 0) {
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = new Class104_Sub1_Sub1_Sub1_Sub1(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19810((Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911));
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21092(this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4117 * -1821838479);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2897 = (this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4112 * -1373680215 << 3) * 1883849079;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			} else {
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21163(Class705.aClass77_Sub39_17);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			}
		}
		if (this.anInt3742 * -849492911 >= 0) {
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19822(arg2, arg0, arg1, true, this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21095());
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21070(arg3, true);
		} else {
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21186(arg0, arg1);
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21070(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "(IIII)V", line = 39)
	void method25745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean643) {
			this.aBoolean643 = true;
			if (this.anInt3742 * -849492911 >= 0) {
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = new Class104_Sub1_Sub1_Sub1_Sub1(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19810((Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911));
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21092(this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4117 * -1821838479);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2897 = (this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4112 * -1373680215 << 3) * 1883849079;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			} else {
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21163(Class705.aClass77_Sub39_17);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			}
		}
		if (this.anInt3742 * -849492911 >= 0) {
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19822(arg2, arg0, arg1, true, this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21095());
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21070(arg3, true);
		} else {
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21186(arg0, arg1);
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21070(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "(IIII)V", line = 39)
	void method25746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean643) {
			this.aBoolean643 = true;
			if (this.anInt3742 * -849492911 >= 0) {
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = new Class104_Sub1_Sub1_Sub1_Sub1(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19810((Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911));
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21092(this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4117 * -1821838479);
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2897 = (this.aClass104_Sub1_Sub1_Sub1_Sub1_2.aClass333_1.anInt4112 * -1373680215 << 3) * 1883849079;
				this.aClass104_Sub1_Sub1_Sub1_Sub1_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			} else {
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435(), 25);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21163(Class705.aClass77_Sub39_17);
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2867 = this.anInt3741 * -2076749011;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2894 = client.anInt3414 * 1162675721;
				this.aClass104_Sub1_Sub1_Sub1_Sub2_2.anInt2873 = ((Class230.anInt3761 += -213444879) * 1294146065 - 1) * 903417281;
			}
		}
		if (this.anInt3742 * -849492911 >= 0) {
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19822(arg2, arg0, arg1, true, this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21095());
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21070(arg3, true);
		} else {
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21186(arg0, arg1);
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21070(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(IIIB)I", line = 43)
	public static int method25747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Class239.method25926(arg2 - arg1 + 1);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 70)
	void method25748() {
		this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "()V", line = 70)
	void method25749() {
		this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "()V", line = 70)
	void method25750() {
		this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "()V", line = 70)
	void method25751() {
		this.aClass104_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass104_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "(IIIB)V", line = 76)
	void method25752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass104_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21186(arg1, arg2);
		} else {
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19822(arg0, arg1, arg2, true, this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21095());
		}
	}

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "(III)V", line = 76)
	void method25753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass104_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass104_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass104_Sub1_Sub1_Sub1_Sub2_2.method21186(arg1, arg2);
		} else {
			this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method19822(arg0, arg1, arg2, true, this.aClass104_Sub1_Sub1_Sub1_Sub1_2.method21095());
		}
	}

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "()Lclient!agh;", line = 84)
	public Class104_Sub1_Sub1_Sub1 method25754() {
		return this.aClass104_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass104_Sub1_Sub1_Sub1_Sub2_2 : this.aClass104_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "(I)Lclient!agh;", line = 84)
	public Class104_Sub1_Sub1_Sub1 method25755() {
		return this.aClass104_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass104_Sub1_Sub1_Sub1_Sub2_2 : this.aClass104_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "()Lclient!agh;", line = 84)
	public Class104_Sub1_Sub1_Sub1 method25756() {
		return this.aClass104_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass104_Sub1_Sub1_Sub1_Sub2_2 : this.aClass104_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "()Lclient!agh;", line = 84)
	public Class104_Sub1_Sub1_Sub1 method25757() {
		return this.aClass104_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass104_Sub1_Sub1_Sub1_Sub2_2 : this.aClass104_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "()Z", line = 89)
	boolean method25758() {
		if (this.anInt3742 * -849492911 < 0) {
			return true;
		}
		@Pc(13) Class333 local13 = (Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911);
		@Pc(17) boolean local17 = local13.method27632();
		if (this.anIntArray364 == null) {
			@Pc(29) Class570 local29 = (Class570) Class96_Sub23.aClass35_Sub15_1.method18319(local13.anInt4111 * 1789154529);
			this.anIntArray364 = local29.method31459();
		}
		@Pc(37) int[] local37 = this.anIntArray364;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local47)).method25888();
		}
		return local17;
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "()Z", line = 89)
	boolean method25759() {
		if (this.anInt3742 * -849492911 < 0) {
			return true;
		}
		@Pc(13) Class333 local13 = (Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911);
		@Pc(17) boolean local17 = local13.method27632();
		if (this.anIntArray364 == null) {
			@Pc(29) Class570 local29 = (Class570) Class96_Sub23.aClass35_Sub15_1.method18319(local13.anInt4111 * 1789154529);
			this.anIntArray364 = local29.method31459();
		}
		@Pc(37) int[] local37 = this.anIntArray364;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local47)).method25888();
		}
		return local17;
	}

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "(B)Z", line = 89)
	boolean method25760() {
		if (this.anInt3742 * -849492911 < 0) {
			return true;
		}
		@Pc(13) Class333 local13 = (Class333) Class578.aClass35_Sub3_1.method18319(this.anInt3742 * -849492911);
		@Pc(17) boolean local17 = local13.method27632();
		if (this.anIntArray364 == null) {
			@Pc(29) Class570 local29 = (Class570) Class96_Sub23.aClass35_Sub15_1.method18319(local13.anInt4111 * 1789154529);
			this.anIntArray364 = local29.method31459();
		}
		@Pc(37) int[] local37 = this.anIntArray364;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local47)).method25888();
		}
		return local17;
	}

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "(II)Z", line = 1748)
	public static boolean method25761(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 17 || arg0 == 7 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ee", name = "ht", descriptor = "(Lclient!yf;S)V", line = 5810)
	static final void method25762(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub19.method13488(local16, local22, true, 0, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "aji", descriptor = "(Lclient!yf;I)V", line = 11214)
	static final void method25763(@OriginalArg(0) Class665 arg0) {
		Class509.method30282((String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147], false, false);
	}
}
