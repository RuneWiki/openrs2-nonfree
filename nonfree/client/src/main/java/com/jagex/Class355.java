package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
class Class355 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ns", name = "this$0", descriptor = "Lclient!nr;")
	final Class354 this$0;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!nr;)V", line = 7)
	Class355(@OriginalArg(0) Class354 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "(Lclient!nm;Lclient!nm;B)I", line = 9)
	int method26629(@OriginalArg(0) Class349 arg0, @OriginalArg(1) Class349 arg1) {
		if (arg0.aLong265 * 7397188561692461639L > arg1.aLong265 * 7397188561692461639L) {
			return 1;
		} else if (arg0.aLong265 * 7397188561692461639L < arg1.aLong265 * 7397188561692461639L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(Lclient!nm;Lclient!nm;)I", line = 9)
	int method26631(@OriginalArg(0) Class349 arg0, @OriginalArg(1) Class349 arg1) {
		if (arg0.aLong265 * 7397188561692461639L > arg1.aLong265 * 7397188561692461639L) {
			return 1;
		} else if (arg0.aLong265 * 7397188561692461639L < arg1.aLong265 * 7397188561692461639L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!nm;Lclient!nm;)I", line = 9)
	int method26635(@OriginalArg(0) Class349 arg0, @OriginalArg(1) Class349 arg1) {
		if (arg0.aLong265 * 7397188561692461639L > arg1.aLong265 * 7397188561692461639L) {
			return 1;
		} else if (arg0.aLong265 * 7397188561692461639L < arg1.aLong265 * 7397188561692461639L) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ns", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26629((Class349) arg0, (Class349) arg1);
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method26630(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26629((Class349) arg0, (Class349) arg1);
	}

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 15)
	public int method26632(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method26629((Class349) arg0, (Class349) arg1);
	}

	@OriginalMember(owner = "client!ns", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method26633(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	public boolean method26634(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 19)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "(IB)V", line = 710)
	public static void method26639(@OriginalArg(0) int arg0) {
		Class178.aClass161_17.method23240(arg0);
		Class178.aClass161_19.method23240(arg0);
		Class178.aClass161_20.method23240(arg0);
		Class178.aClass161_18.method23240(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "eq", descriptor = "(Lclient!vs;B)V", line = 4881)
	static final void method26636(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class245.method24866(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ns", name = "mt", descriptor = "(Ljava/lang/String;I)V", line = 11730)
	static void method26638(@OriginalArg(0) String arg0) {
		client.aString150 = arg0;
		if (Class527.method32424() == Class389.aClass389_3) {
			return;
		}
		try {
			@Pc(11) String local11 = Class524.anApplet2.getParameter(Class296.aClass296_5.aString197);
			@Pc(16) String local16 = Class524.anApplet2.getParameter(Class296.aClass296_21.aString197);
			@Pc(31) String local31 = local11 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Class431.method27961(Class176.method23413() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Class588.method33289(Class524.anApplet2, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(78) Throwable local78) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "avy", descriptor = "(Lclient!vs;I)V", line = 12805)
	static final void method26637(@OriginalArg(0) Class536 arg0) {
		@Pc(17) boolean local17 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
		Class207.method24223(local17);
	}
}
