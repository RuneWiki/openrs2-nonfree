package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class551 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!afa;")
	Class53_Sub1 aClass53_Sub1_7;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!afa;")
	public Class53_Sub1 aClass53_Sub1_8 = new Class53_Sub1();

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 9)
	public Class551() {
		this.aClass53_Sub1_8.aClass53_Sub1_6 = this.aClass53_Sub1_8;
		this.aClass53_Sub1_8.aClass53_Sub1_5 = this.aClass53_Sub1_8;
	}

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "(Lclient!afa;B)V", line = 15)
	public void method32683(@OriginalArg(0) Class53_Sub1 arg0) {
		if (arg0.aClass53_Sub1_5 != null) {
			arg0.method20621();
		}
		arg0.aClass53_Sub1_5 = this.aClass53_Sub1_8.aClass53_Sub1_5;
		arg0.aClass53_Sub1_6 = this.aClass53_Sub1_8;
		arg0.aClass53_Sub1_5.aClass53_Sub1_6 = arg0;
		arg0.aClass53_Sub1_6.aClass53_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(Lclient!afa;)V", line = 15)
	public void method32686(@OriginalArg(0) Class53_Sub1 arg0) {
		if (arg0.aClass53_Sub1_5 != null) {
			arg0.method20621();
		}
		arg0.aClass53_Sub1_5 = this.aClass53_Sub1_8.aClass53_Sub1_5;
		arg0.aClass53_Sub1_6 = this.aClass53_Sub1_8;
		arg0.aClass53_Sub1_5.aClass53_Sub1_6 = arg0;
		arg0.aClass53_Sub1_6.aClass53_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "(Lclient!afa;)V", line = 15)
	public void method32687(@OriginalArg(0) Class53_Sub1 arg0) {
		if (arg0.aClass53_Sub1_5 != null) {
			arg0.method20621();
		}
		arg0.aClass53_Sub1_5 = this.aClass53_Sub1_8.aClass53_Sub1_5;
		arg0.aClass53_Sub1_6 = this.aClass53_Sub1_8;
		arg0.aClass53_Sub1_5.aClass53_Sub1_6 = arg0;
		arg0.aClass53_Sub1_6.aClass53_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "()Lclient!afa;", line = 23)
	public Class53_Sub1 method32688() {
		@Pc(3) Class53_Sub1 local3 = this.aClass53_Sub1_8.aClass53_Sub1_6;
		if (this.aClass53_Sub1_8 == local3) {
			this.aClass53_Sub1_7 = null;
			return null;
		} else {
			this.aClass53_Sub1_7 = local3.aClass53_Sub1_6;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "()Lclient!afa;", line = 23)
	public Class53_Sub1 method32689() {
		@Pc(3) Class53_Sub1 local3 = this.aClass53_Sub1_8.aClass53_Sub1_6;
		if (this.aClass53_Sub1_8 == local3) {
			this.aClass53_Sub1_7 = null;
			return null;
		} else {
			this.aClass53_Sub1_7 = local3.aClass53_Sub1_6;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "()Lclient!afa;", line = 23)
	public Class53_Sub1 method32690() {
		@Pc(3) Class53_Sub1 local3 = this.aClass53_Sub1_8.aClass53_Sub1_6;
		if (this.aClass53_Sub1_8 == local3) {
			this.aClass53_Sub1_7 = null;
			return null;
		} else {
			this.aClass53_Sub1_7 = local3.aClass53_Sub1_6;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Lclient!afa;", line = 23)
	public Class53_Sub1 method32691() {
		@Pc(3) Class53_Sub1 local3 = this.aClass53_Sub1_8.aClass53_Sub1_6;
		if (this.aClass53_Sub1_8 == local3) {
			this.aClass53_Sub1_7 = null;
			return null;
		} else {
			this.aClass53_Sub1_7 = local3.aClass53_Sub1_6;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)Lclient!afa;", line = 33)
	public Class53_Sub1 method32684() {
		@Pc(2) Class53_Sub1 local2 = this.aClass53_Sub1_7;
		if (local2 == this.aClass53_Sub1_8) {
			this.aClass53_Sub1_7 = null;
			return null;
		} else {
			this.aClass53_Sub1_7 = local2.aClass53_Sub1_6;
			return local2;
		}
	}

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "(I)V", line = 44)
	public void method32682() {
		while (true) {
			@Pc(3) Class53_Sub1 local3 = this.aClass53_Sub1_8.aClass53_Sub1_6;
			if (this.aClass53_Sub1_8 == local3) {
				this.aClass53_Sub1_7 = null;
				return;
			}
			local3.method20621();
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()V", line = 44)
	public void method32685() {
		while (true) {
			@Pc(3) Class53_Sub1 local3 = this.aClass53_Sub1_8.aClass53_Sub1_6;
			if (this.aClass53_Sub1_8 == local3) {
				this.aClass53_Sub1_7 = null;
				return;
			}
			local3.method20621();
		}
	}

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "(Lclient!de;Lclient!ny;B)V", line = 93)
	public static void method32694(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class359 arg1) {
		@Pc(6) Class15[] local6 = Class137.method22942(arg1, Class568.anInt5374 * 1855541627, 0);
		Class331.aClass6Array12 = new Class6[local6.length];
		@Pc(12) int local12;
		for (local12 = 0; local12 < local6.length; local12++) {
			Class331.aClass6Array12[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, Class568.anInt5375 * 1066549597, 0);
		Class542.aClass6Array15 = new Class6[local6.length];
		for (local12 = 0; local12 < local6.length; local12++) {
			Class542.aClass6Array15[local12] = arg0.method17089(local6[local12], true);
		}
		local6 = Class137.method22942(arg1, Class568.anInt5376 * 489968913, 0);
		Class68.aClass6Array5 = new Class6[local6.length];
		@Pc(68) byte local68 = 25;
		@Pc(70) int local70;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class68.aClass6Array5[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class264.anInt4207 * 1856440075, 0);
		Class145.aClass6Array11 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class145.aClass6Array11[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class529.anInt5305 * -617565157, 0);
		Class486.aClass6Array14 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class486.aClass6Array14[local70] = arg0.method17089(local6[local70], true);
		}
		local6 = Class137.method22942(arg1, Class519.anInt5284 * 1071850601, 0);
		Class19_Sub1.aClass6Array10 = new Class6[local6.length];
		local68 = 12;
		for (local70 = 0; local70 < local6.length; local70++) {
			local6[local70].method3482(-local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D), -local68 + (int) (Math.random() * (double) local68 * 2.0D));
			Class19_Sub1.aClass6Array10[local70] = arg0.method17089(local6[local70], true);
		}
		Class568.aClass6_36 = arg0.method17089(Class137.method22938(arg1, Class230.anInt3737 * 1195525849, 0), true);
		Class19_Sub1.aClass6_23 = arg0.method17089(Class137.method22938(arg1, FileFilter_Sub1.anInt2088 * 235232017, 0), true);
		local6 = Class137.method22942(arg1, Class568.anInt5377 * -379151387, 0);
		Class16.aClass6Array3 = new Class6[local6.length];
		for (local70 = 0; local70 < local6.length; local70++) {
			Class16.aClass6Array3[local70] = arg0.method17089(local6[local70], true);
		}
	}

	@OriginalMember(owner = "client!wh", name = "jp", descriptor = "(Lclient!vs;I)V", line = 5712)
	static final void method32693(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class634.method33901(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "alb", descriptor = "(Lclient!vs;I)V", line = 11095)
	static final void method32692(@OriginalArg(0) Class536 arg0) {
		Class602.method33522();
	}
}
