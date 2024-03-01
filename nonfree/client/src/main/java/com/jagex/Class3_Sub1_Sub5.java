package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ami")
public class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "Lclient!xn;")
	Class581 aClass581_16;

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "()V", line = 14)
	Class3_Sub1_Sub5() {
	}

	@OriginalMember(owner = "client!ami", name = "p", descriptor = "(Lclient!ahb;I)V", line = 18)
	void method18927(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method18928(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ami", name = "h", descriptor = "(Lclient!ahb;)V", line = 18)
	void method18931(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method18928(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ami", name = "x", descriptor = "(Lclient!ahb;)V", line = 18)
	void method18932(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method18928(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method18926(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method20269();
		@Pc(13) int local13;
		if (this.aClass581_16 == null) {
			local13 = Class302.method25670(local6);
			this.aClass581_16 = new Class581(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(33) boolean local33 = arg0.method20269() == 1;
			@Pc(37) int local37 = arg0.method20273();
			@Pc(46) Class3 local46;
			if (local33) {
				local46 = new Class3_Sub29(arg0.method20283());
			} else {
				local46 = new Class3_Sub21(arg0.method20275());
			}
			this.aClass581_16.method33241(local46, (long) local37);
		}
	}

	@OriginalMember(owner = "client!ami", name = "a", descriptor = "(Lclient!ahb;II)V", line = 25)
	void method18928(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method20269();
		@Pc(13) int local13;
		if (this.aClass581_16 == null) {
			local13 = Class302.method25670(local6);
			this.aClass581_16 = new Class581(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(33) boolean local33 = arg0.method20269() == 1;
			@Pc(37) int local37 = arg0.method20273();
			@Pc(46) Class3 local46;
			if (local33) {
				local46 = new Class3_Sub29(arg0.method20283());
			} else {
				local46 = new Class3_Sub21(arg0.method20275());
			}
			this.aClass581_16.method33241(local46, (long) local37);
		}
	}

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "(Lclient!ahb;I)V", line = 25)
	void method18929(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method20269();
		@Pc(13) int local13;
		if (this.aClass581_16 == null) {
			local13 = Class302.method25670(local6);
			this.aClass581_16 = new Class581(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(33) boolean local33 = arg0.method20269() == 1;
			@Pc(37) int local37 = arg0.method20273();
			@Pc(46) Class3 local46;
			if (local33) {
				local46 = new Class3_Sub29(arg0.method20283());
			} else {
				local46 = new Class3_Sub21(arg0.method20275());
			}
			this.aClass581_16.method33241(local46, (long) local37);
		}
	}

	@OriginalMember(owner = "client!ami", name = "y", descriptor = "(II)I", line = 44)
	public int method18933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_16 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub21 local12 = (Class3_Sub21) this.aClass581_16.method33217((long) arg0);
			return local12 == null ? arg1 : local12.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!ami", name = "g", descriptor = "(III)I", line = 44)
	public int method18934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_16 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub21 local12 = (Class3_Sub21) this.aClass581_16.method33217((long) arg0);
			return local12 == null ? arg1 : local12.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 51)
	public String method18930(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_16 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub29 local12 = (Class3_Sub29) this.aClass581_16.method33217((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject2;
		}
	}

	@OriginalMember(owner = "client!ami", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 51)
	public String method18935(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_16 == null) {
			return arg1;
		} else {
			@Pc(12) Class3_Sub29 local12 = (Class3_Sub29) this.aClass581_16.method33217((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject2;
		}
	}
}
