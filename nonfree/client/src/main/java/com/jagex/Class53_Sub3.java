package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aff")
public class Class53_Sub3 extends Class53 {

	@OriginalMember(owner = "client!aff", name = "l", descriptor = "Lclient!wq;")
	Class559 aClass559_2 = new Class559();

	@OriginalMember(owner = "client!aff", name = "g", descriptor = "Lclient!qp;")
	public Class414 aClass414_1;

	@OriginalMember(owner = "client!aff", name = "<init>", descriptor = "(Lclient!qp;)V", line = 12)
	public Class53_Sub3(@OriginalArg(0) Class414 arg0) {
		this.aClass414_1 = arg0;
	}

	@OriginalMember(owner = "client!aff", name = "a", descriptor = "(IIIIB)V", line = 17)
	public void method10231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class53_Sub2 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class53_Sub2 local9 = (Class53_Sub2) this.aClass559_2.method32822(); local9 != null; local9 = (Class53_Sub2) this.aClass559_2.method32837()) {
			local3++;
			if (arg0 == local9.anInt1134 * -690171467) {
				local9.method9974(arg0, arg1, arg2, arg3);
				return;
			}
			if (local9.anInt1134 * -690171467 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class210.method24251(new Class53_Sub2(arg0, arg1, arg2, arg3), local1);
			if (local3 >= Class630.aClass493_1.anInt5215 * 1266384197) {
				this.aClass559_2.method32822().method20615();
			}
		} else if (local3 < Class630.aClass493_1.anInt5215 * 1266384197) {
			this.aClass559_2.method32831(new Class53_Sub2(arg0, arg1, arg2, arg3));
		}
	}

	@OriginalMember(owner = "client!aff", name = "h", descriptor = "(IIII)V", line = 17)
	public void method10234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class53_Sub2 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class53_Sub2 local9 = (Class53_Sub2) this.aClass559_2.method32822(); local9 != null; local9 = (Class53_Sub2) this.aClass559_2.method32837()) {
			local3++;
			if (arg0 == local9.anInt1134 * -690171467) {
				local9.method9974(arg0, arg1, arg2, arg3);
				return;
			}
			if (local9.anInt1134 * -690171467 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class210.method24251(new Class53_Sub2(arg0, arg1, arg2, arg3), local1);
			if (local3 >= Class630.aClass493_1.anInt5215 * 1266384197) {
				this.aClass559_2.method32822().method20615();
			}
		} else if (local3 < Class630.aClass493_1.anInt5215 * 1266384197) {
			this.aClass559_2.method32831(new Class53_Sub2(arg0, arg1, arg2, arg3));
		}
	}

	@OriginalMember(owner = "client!aff", name = "x", descriptor = "(IIII)V", line = 17)
	public void method10235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class53_Sub2 local1 = null;
		@Pc(3) int local3 = 0;
		for (@Pc(9) Class53_Sub2 local9 = (Class53_Sub2) this.aClass559_2.method32822(); local9 != null; local9 = (Class53_Sub2) this.aClass559_2.method32837()) {
			local3++;
			if (arg0 == local9.anInt1134 * -690171467) {
				local9.method9974(arg0, arg1, arg2, arg3);
				return;
			}
			if (local9.anInt1134 * -690171467 <= arg0) {
				local1 = local9;
			}
		}
		if (local1 != null) {
			Class210.method24251(new Class53_Sub2(arg0, arg1, arg2, arg3), local1);
			if (local3 >= Class630.aClass493_1.anInt5215 * 1266384197) {
				this.aClass559_2.method32822().method20615();
			}
		} else if (local3 < Class630.aClass493_1.anInt5215 * 1266384197) {
			this.aClass559_2.method32831(new Class53_Sub2(arg0, arg1, arg2, arg3));
		}
	}

	@OriginalMember(owner = "client!aff", name = "g", descriptor = "(IB)Lclient!afc;", line = 36)
	public Class53_Sub2 method10232(@OriginalArg(0) int arg0) {
		@Pc(5) Class53_Sub2 local5 = (Class53_Sub2) this.aClass559_2.method32822();
		if (local5 == null || local5.anInt1134 * -690171467 > arg0) {
			return null;
		}
		for (@Pc(21) Class53_Sub2 local21 = (Class53_Sub2) this.aClass559_2.method32837(); local21 != null && local21.anInt1134 * -690171467 <= arg0; local21 = (Class53_Sub2) this.aClass559_2.method32837()) {
			local5.method20615();
			local5 = local21;
		}
		if (local5.anInt1135 * -371243049 + local5.anInt1134 * -690171467 + this.aClass414_1.anInt4827 * 1015289249 > arg0) {
			return local5;
		} else {
			local5.method20615();
			return null;
		}
	}

	@OriginalMember(owner = "client!aff", name = "s", descriptor = "(I)Lclient!afc;", line = 36)
	public Class53_Sub2 method10236(@OriginalArg(0) int arg0) {
		@Pc(5) Class53_Sub2 local5 = (Class53_Sub2) this.aClass559_2.method32822();
		if (local5 == null || local5.anInt1134 * -690171467 > arg0) {
			return null;
		}
		for (@Pc(21) Class53_Sub2 local21 = (Class53_Sub2) this.aClass559_2.method32837(); local21 != null && local21.anInt1134 * -690171467 <= arg0; local21 = (Class53_Sub2) this.aClass559_2.method32837()) {
			local5.method20615();
			local5 = local21;
		}
		if (local5.anInt1135 * -371243049 + local5.anInt1134 * -690171467 + this.aClass414_1.anInt4827 * 1015289249 > arg0) {
			return local5;
		} else {
			local5.method20615();
			return null;
		}
	}

	@OriginalMember(owner = "client!aff", name = "u", descriptor = "()Z", line = 53)
	public boolean method10233() {
		return this.aClass559_2.method32817();
	}

	@OriginalMember(owner = "client!aff", name = "l", descriptor = "(I)Z", line = 53)
	public boolean method10237() {
		return this.aClass559_2.method32817();
	}

	@OriginalMember(owner = "client!aff", name = "y", descriptor = "()Z", line = 53)
	public boolean method10238() {
		return this.aClass559_2.method32817();
	}
}
