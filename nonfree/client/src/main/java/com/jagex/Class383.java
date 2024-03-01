package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public class Class383 implements Interface32 {

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	public final int anInt4640;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!kv;")
	public final Class390 aClass390_10;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!ky;")
	public final Class392 aClass392_10;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public final int anInt4634;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public final int anInt4635;

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
	public final int anInt4638;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
	public final int anInt4639;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public final int anInt4636;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
	public final int anInt4637;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public final int anInt4633;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Z")
	public final boolean aBoolean740;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILclient!kv;Lclient!ky;IIIIIIIZ)V", line = 18)
	Class383(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class392 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4640 = arg0 * -622430119;
		this.aClass390_10 = arg1;
		this.aClass392_10 = arg2;
		this.anInt4634 = arg3 * -1535159005;
		this.anInt4635 = arg4 * -966562555;
		this.anInt4638 = arg5 * 821893791;
		this.anInt4639 = arg6 * -1847184945;
		this.anInt4636 = arg7 * -1690261347;
		this.anInt4637 = arg8 * 1349203391;
		this.anInt4633 = arg9 * -385412903;
		this.aBoolean740 = arg10;
	}

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "(Lclient!alw;)Lclient!kn;", line = 33)
	public static Class383 method28139(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		@Pc(10) Class390 local10 = Class708.method36756()[arg0.method22413()];
		@Pc(17) Class392 local17 = Class252.method25978()[arg0.method22413()];
		@Pc(21) int local21 = arg0.method22482();
		@Pc(25) int local25 = arg0.method22482();
		@Pc(29) int local29 = arg0.method22415();
		@Pc(33) int local33 = arg0.method22415();
		@Pc(37) int local37 = arg0.method22419();
		@Pc(41) int local41 = arg0.method22419();
		@Pc(45) int local45 = arg0.method22419();
		@Pc(54) boolean local54 = arg0.method22413() == 1;
		return new Class383(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "(Lclient!alw;)Lclient!kn;", line = 33)
	public static Class383 method28140(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		@Pc(10) Class390 local10 = Class708.method36756()[arg0.method22413()];
		@Pc(17) Class392 local17 = Class252.method25978()[arg0.method22413()];
		@Pc(21) int local21 = arg0.method22482();
		@Pc(25) int local25 = arg0.method22482();
		@Pc(29) int local29 = arg0.method22415();
		@Pc(33) int local33 = arg0.method22415();
		@Pc(37) int local37 = arg0.method22419();
		@Pc(41) int local41 = arg0.method22419();
		@Pc(45) int local45 = arg0.method22419();
		@Pc(54) boolean local54 = arg0.method22413() == 1;
		return new Class383(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(Lclient!alw;)Lclient!kn;", line = 33)
	public static Class383 method28141(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		@Pc(10) Class390 local10 = Class708.method36756()[arg0.method22413()];
		@Pc(17) Class392 local17 = Class252.method25978()[arg0.method22413()];
		@Pc(21) int local21 = arg0.method22482();
		@Pc(25) int local25 = arg0.method22482();
		@Pc(29) int local29 = arg0.method22415();
		@Pc(33) int local33 = arg0.method22415();
		@Pc(37) int local37 = arg0.method22419();
		@Pc(41) int local41 = arg0.method22419();
		@Pc(45) int local45 = arg0.method22419();
		@Pc(54) boolean local54 = arg0.method22413() == 1;
		return new Class383(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "(S)Lclient!kt;", line = 48)
	@Override
	public Class388 method28578() {
		return Class388.aClass388_5;
	}

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "()Lclient!kt;", line = 48)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_5;
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I[II)Z", line = 289)
	public static boolean method28145(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (Class9.aBooleanArray1[arg0]) {
			return true;
		}
		Class166_Sub1.aClass320Array1[arg0] = Class133.method10072(arg0, arg1, Class166_Sub1.aClass320Array1[arg0], false);
		if (Class166_Sub1.aClass320Array1[arg0] == null) {
			return false;
		} else {
			Class9.aBooleanArray1[arg0] = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!kn", name = "py", descriptor = "(Lclient!yf;I)V", line = 7811)
	static final void method28142(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class647.method32648(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!kn", name = "to", descriptor = "(Lclient!yf;I)V", line = 8502)
	static final void method28143(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class32_Sub19.method17403(local11, arg0);
	}

	@OriginalMember(owner = "client!kn", name = "bdi", descriptor = "(Lclient!yf;I)V", line = 14730)
	static final void method28144(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class527.aString222.startsWith("mac") ? 1 : 0;
	}
}
