package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xe")
public class Class656 {

	@OriginalMember(owner = "client!xe", name = "e", descriptor = "I")
	public int anInt5810;

	@OriginalMember(owner = "client!xe", name = "<init>", descriptor = "(I)V", line = 6)
	public Class656(@OriginalArg(0) int arg0) {
		this.anInt5810 = arg0 * -33749981;
	}

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "(I)Z", line = 55)
	static boolean method32746() {
		if (Class474.aProcess1 == null) {
			return false;
		}
		try {
			Class474.aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!xe", name = "k", descriptor = "(II)V", line = 55)
	static void method32747(@OriginalArg(0) int arg0) {
		Class173.aClass240_64.method25832(arg0);
	}

	@OriginalMember(owner = "client!xe", name = "anh", descriptor = "(Lclient!yf;I)V", line = 12269)
	static final void method32749(@OriginalArg(0) Class681 arg0) throws Exception_Sub3 {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(31) Class472 local31 = Class472.method29529((float) local13, (float) local13, (float) local13);
		if (local31.aFloat317 == -1.0F) {
			local31.aFloat317 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat318 == -1.0F) {
			local31.aFloat318 = Float.POSITIVE_INFINITY;
		}
		if (local31.aFloat319 == -1.0F) {
			local31.aFloat319 = Float.POSITIVE_INFINITY;
		}
		Class65.aClass123_Sub1_2.method8933(local31);
		Class65.aClass123_Sub1_2.method8955((float) local23 / 1000.0F);
		local31.method29532();
	}

	@OriginalMember(owner = "client!xe", name = "ask", descriptor = "(Lclient!yf;B)V", line = 13072)
	static final void method32748(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		Class543.method30948(Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424(), false);
		Class106_Sub1.method5148();
	}
}
