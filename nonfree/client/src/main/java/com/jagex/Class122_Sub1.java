package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahb")
public class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!ahb", name = "z", descriptor = "Lclient!cm;")
	Class100 aClass100_27;

	@OriginalMember(owner = "client!ahb", name = "u", descriptor = "Lclient!cm;")
	Class100 aClass100_28;

	@OriginalMember(owner = "client!ahb", name = "d", descriptor = "Lclient!cm;")
	Class100 aClass100_29;

	@OriginalMember(owner = "client!ahb", name = "p", descriptor = "Lclient!cm;")
	Class100 aClass100_30;

	@OriginalMember(owner = "client!ahb", name = "l", descriptor = "Lclient!cm;")
	Class100 aClass100_31;

	@OriginalMember(owner = "client!ahb", name = "c", descriptor = "Lclient!cm;")
	Class100 aClass100_32;

	@OriginalMember(owner = "client!ahb", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!ahp;)V", line = 18)
	Class122_Sub1(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahb", name = "e", descriptor = "(I)V", line = 22)
	@Override
	public void method28280() {
		super.method28280();
		@Pc(6) Class125_Sub2 local6 = (Class125_Sub2) this.aClass125_5;
		this.aClass100_31 = Class219.method25509(this.aClass497_90, local6.anInt2987 * -312428519);
		this.aClass100_28 = Class219.method25509(this.aClass497_90, local6.anInt2988 * 813929059);
		this.aClass100_27 = Class219.method25509(this.aClass497_90, local6.anInt2990 * -2031575365);
		this.aClass100_30 = Class219.method25509(this.aClass497_90, local6.anInt2991 * 79921115);
		this.aClass100_29 = Class219.method25509(this.aClass497_90, local6.anInt2989 * -143127169);
		this.aClass100_32 = Class219.method25509(this.aClass497_90, local6.anInt2992 * 247837873);
	}

	@OriginalMember(owner = "client!ahb", name = "w", descriptor = "()V", line = 22)
	@Override
	public void method28283() {
		super.method28280();
		@Pc(6) Class125_Sub2 local6 = (Class125_Sub2) this.aClass125_5;
		this.aClass100_31 = Class219.method25509(this.aClass497_90, local6.anInt2987 * -312428519);
		this.aClass100_28 = Class219.method25509(this.aClass497_90, local6.anInt2988 * 813929059);
		this.aClass100_27 = Class219.method25509(this.aClass497_90, local6.anInt2990 * -2031575365);
		this.aClass100_30 = Class219.method25509(this.aClass497_90, local6.anInt2991 * 79921115);
		this.aClass100_29 = Class219.method25509(this.aClass497_90, local6.anInt2989 * -143127169);
		this.aClass100_32 = Class219.method25509(this.aClass497_90, local6.anInt2992 * 247837873);
	}

	@OriginalMember(owner = "client!ahb", name = "l", descriptor = "()V", line = 22)
	@Override
	public void method28284() {
		super.method28280();
		@Pc(6) Class125_Sub2 local6 = (Class125_Sub2) this.aClass125_5;
		this.aClass100_31 = Class219.method25509(this.aClass497_90, local6.anInt2987 * -312428519);
		this.aClass100_28 = Class219.method25509(this.aClass497_90, local6.anInt2988 * 813929059);
		this.aClass100_27 = Class219.method25509(this.aClass497_90, local6.anInt2990 * -2031575365);
		this.aClass100_30 = Class219.method25509(this.aClass497_90, local6.anInt2991 * 79921115);
		this.aClass100_29 = Class219.method25509(this.aClass497_90, local6.anInt2989 * -143127169);
		this.aClass100_32 = Class219.method25509(this.aClass497_90, local6.anInt2992 * 247837873);
	}

	@OriginalMember(owner = "client!ahb", name = "z", descriptor = "(ZIIS)V", line = 33)
	@Override
	void method20211(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class694.aClass104_14.method20470(local4);
		Class694.aClass104_14.method20467(arg1, arg2, this.aClass125_5.anInt2983 * 1135283731 + arg1, this.aClass125_5.anInt2980 * -1017655207 + arg2);
		@Pc(29) int local29 = this.aClass100_27.method18160();
		@Pc(33) int local33 = this.aClass100_27.method18166();
		@Pc(37) int local37 = this.aClass100_30.method18160();
		@Pc(41) int local41 = this.aClass100_30.method18166();
		this.aClass100_27.method18169(arg1, (this.aClass125_5.anInt2980 * -1017655207 - local33) / 2 + arg2);
		this.aClass100_30.method18169(arg1 + this.aClass125_5.anInt2983 * 1135283731 - local37, arg2 + (this.aClass125_5.anInt2980 * -1017655207 - local41) / 2);
		Class694.aClass104_14.method20467(arg1, arg2, arg1 + this.aClass125_5.anInt2983 * 1135283731, arg2 + this.aClass100_29.method18166());
		this.aClass100_29.method18178(local29 + arg1, arg2, this.aClass125_5.anInt2983 * 1135283731 - local29 - local37, this.aClass125_5.anInt2980 * -1017655207);
		@Pc(120) int local120 = this.aClass100_32.method18166();
		Class694.aClass104_14.method20467(arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207 - local120, this.aClass125_5.anInt2983 * 1135283731 + arg1, this.aClass125_5.anInt2980 * -1017655207 + arg2);
		this.aClass100_32.method18178(local29 + arg1, this.aClass125_5.anInt2980 * -1017655207 + arg2 - local120, this.aClass125_5.anInt2983 * 1135283731 - local29 - local37, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20467(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahb", name = "c", descriptor = "(ZII)V", line = 33)
	@Override
	void method20214(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class694.aClass104_14.method20470(local4);
		Class694.aClass104_14.method20467(arg1, arg2, this.aClass125_5.anInt2983 * 1135283731 + arg1, this.aClass125_5.anInt2980 * -1017655207 + arg2);
		@Pc(29) int local29 = this.aClass100_27.method18160();
		@Pc(33) int local33 = this.aClass100_27.method18166();
		@Pc(37) int local37 = this.aClass100_30.method18160();
		@Pc(41) int local41 = this.aClass100_30.method18166();
		this.aClass100_27.method18169(arg1, (this.aClass125_5.anInt2980 * -1017655207 - local33) / 2 + arg2);
		this.aClass100_30.method18169(arg1 + this.aClass125_5.anInt2983 * 1135283731 - local37, arg2 + (this.aClass125_5.anInt2980 * -1017655207 - local41) / 2);
		Class694.aClass104_14.method20467(arg1, arg2, arg1 + this.aClass125_5.anInt2983 * 1135283731, arg2 + this.aClass100_29.method18166());
		this.aClass100_29.method18178(local29 + arg1, arg2, this.aClass125_5.anInt2983 * 1135283731 - local29 - local37, this.aClass125_5.anInt2980 * -1017655207);
		@Pc(120) int local120 = this.aClass100_32.method18166();
		Class694.aClass104_14.method20467(arg1, arg2 + this.aClass125_5.anInt2980 * -1017655207 - local120, this.aClass125_5.anInt2983 * 1135283731 + arg1, this.aClass125_5.anInt2980 * -1017655207 + arg2);
		this.aClass100_32.method18178(local29 + arg1, this.aClass125_5.anInt2980 * -1017655207 + arg2 - local120, this.aClass125_5.anInt2983 * 1135283731 - local29 - local37, this.aClass125_5.anInt2980 * -1017655207);
		Class694.aClass104_14.method20467(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ahb", name = "k", descriptor = "(IB)I", line = 35)
	static final int method20226(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ahb", name = "p", descriptor = "(ZIII)V", line = 53)
	@Override
	void method20212(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 + this.aClass100_27.method18160();
		@Pc(17) int local17 = arg1 + this.aClass125_5.anInt2983 * 1135283731 - this.aClass100_30.method18160();
		@Pc(23) int local23 = arg2 + this.aClass100_29.method18166();
		@Pc(35) int local35 = this.aClass125_5.anInt2980 * -1017655207 + arg2 - this.aClass100_32.method18166();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20213() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class694.aClass104_14.method20470(local54);
		Class694.aClass104_14.method20467(local5, local23, local5 + local51, local35);
		this.method20221(local5, local23, local39, local43);
		Class694.aClass104_14.method20467(local51 + local5, local23, local17, local35);
		this.aClass100_28.method18178(local5, local23, local39, local43);
		Class694.aClass104_14.method20467(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!ahb", name = "v", descriptor = "(ZII)V", line = 53)
	@Override
	void method20216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + this.aClass100_27.method18160();
		@Pc(17) int local17 = arg0 + this.aClass125_5.anInt2983 * 1135283731 - this.aClass100_30.method18160();
		@Pc(23) int local23 = arg1 + this.aClass100_29.method18166();
		@Pc(35) int local35 = this.aClass125_5.anInt2980 * -1017655207 + arg1 - this.aClass100_32.method18166();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20213() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class694.aClass104_14.method20470(local54);
		Class694.aClass104_14.method20467(local5, local23, local5 + local51, local35);
		this.method20221(local5, local23, local39, local43);
		Class694.aClass104_14.method20467(local51 + local5, local23, local17, local35);
		this.aClass100_28.method18178(local5, local23, local39, local43);
		Class694.aClass104_14.method20467(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!ahb", name = "o", descriptor = "(ZII)V", line = 53)
	@Override
	void method20217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + this.aClass100_27.method18160();
		@Pc(17) int local17 = arg0 + this.aClass125_5.anInt2983 * 1135283731 - this.aClass100_30.method18160();
		@Pc(23) int local23 = arg1 + this.aClass100_29.method18166();
		@Pc(35) int local35 = this.aClass125_5.anInt2980 * -1017655207 + arg1 - this.aClass100_32.method18166();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20213() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class694.aClass104_14.method20470(local54);
		Class694.aClass104_14.method20467(local5, local23, local5 + local51, local35);
		this.method20221(local5, local23, local39, local43);
		Class694.aClass104_14.method20467(local51 + local5, local23, local17, local35);
		this.aClass100_28.method18178(local5, local23, local39, local43);
		Class694.aClass104_14.method20467(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!ahb", name = "s", descriptor = "(IIIII)V", line = 70)
	void method20221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass100_31.method18178(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahb", name = "y", descriptor = "(IIII)V", line = 70)
	void method20222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass100_31.method18178(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahb", name = "q", descriptor = "(IIII)V", line = 70)
	void method20223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass100_31.method18178(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahb", name = "x", descriptor = "(IIII)V", line = 70)
	void method20224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass100_31.method18178(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ahb", name = "u", descriptor = "()Z", line = 74)
	@Override
	public boolean method28278() {
		if (!super.method28279()) {
			return false;
		}
		@Pc(9) Class125_Sub2 local9 = (Class125_Sub2) this.aClass125_5;
		if (!this.aClass497_90.method30054(local9.anInt2987 * -312428519)) {
			return false;
		} else if (!this.aClass497_90.method30054(local9.anInt2988 * 813929059)) {
			return false;
		} else if (!this.aClass497_90.method30054(local9.anInt2990 * -2031575365)) {
			return false;
		} else if (!this.aClass497_90.method30054(local9.anInt2991 * 79921115)) {
			return false;
		} else if (this.aClass497_90.method30054(local9.anInt2989 * -143127169)) {
			return this.aClass497_90.method30054(local9.anInt2992 * 247837873);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "m", descriptor = "(I)Z", line = 74)
	@Override
	public boolean method28279() {
		if (!super.method28279()) {
			return false;
		}
		@Pc(9) Class125_Sub2 local9 = (Class125_Sub2) this.aClass125_5;
		if (!this.aClass497_90.method30054(local9.anInt2987 * -312428519)) {
			return false;
		} else if (!this.aClass497_90.method30054(local9.anInt2988 * 813929059)) {
			return false;
		} else if (!this.aClass497_90.method30054(local9.anInt2990 * -2031575365)) {
			return false;
		} else if (!this.aClass497_90.method30054(local9.anInt2991 * 79921115)) {
			return false;
		} else if (this.aClass497_90.method30054(local9.anInt2989 * -143127169)) {
			return this.aClass497_90.method30054(local9.anInt2992 * 247837873);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "wo", descriptor = "(Lclient!yf;I)V", line = 8935)
	static final void method20227(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -725861497;
		Class274.aClass258_1.method26118(arg0.anIntArray519[arg0.anInt5891 * -1497248091], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "abx", descriptor = "(Lclient!yf;I)V", line = 9922)
	static final void method20225(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26620() == local12 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ahb", name = "atg", descriptor = "(Lclient!yf;I)V", line = 13297)
	static final void method20228(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub15_1.method15673();
	}
}
