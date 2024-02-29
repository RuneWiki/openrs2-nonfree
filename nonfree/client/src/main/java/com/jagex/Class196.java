package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
class Class196 implements Comparator {

	@OriginalMember(owner = "client!ct", name = "jd", descriptor = "Lclient!rm;")
	public static Class514 aClass514_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ct", name = "this$0", descriptor = "Lclient!ahx;")
	final Class117_Sub2 this$0;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ahx;)V", line = 124)
	Class196(@OriginalArg(0) Class117_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(Lclient!qe;Lclient!qe;)I", line = 126)
	int method25451(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "(Lclient!qe;Lclient!qe;)I", line = 126)
	int method25452(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "(Lclient!qe;Lclient!qe;I)I", line = 126)
	int method25453(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method25454(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25453((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method25455(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25453((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method25456(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25453((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method25457(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25453((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!ct", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method25453((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!ct", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25458(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25459(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25460(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method25461(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "al", descriptor = "(Lclient!yf;I)V", line = 237)
	static void method25462(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class59.method875() ? 1 : 0;
	}

	@OriginalMember(owner = "client!ct", name = "fj", descriptor = "(IIIZI)V", line = 2229)
	public static void method25463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		client.aLong242 = 0L;
		@Pc(4) int local4 = Class569.method31421();
		if (arg0 == 3 || local4 == 3) {
			arg3 = true;
		}
		if (!Class284.aClass86_9.method20052()) {
			arg3 = true;
		}
		Class484.method29857(local4, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ct", name = "ea", descriptor = "(Lclient!yf;I)V", line = 5339)
	static final void method25464(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class600.method32039(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ct", name = "ij", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6077)
	static final void method25465(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		if (Class277.anInt3926 * 1098206671 == local12 || local12 == Class277.anInt3847 * -1863691869 || local12 == Class277.anInt3864 * 1319143699 || Class277.anInt3848 * 2113390179 == local12) {
			arg0.anInt3924 = local12 * 417212025;
		}
	}

	@OriginalMember(owner = "client!ct", name = "jd", descriptor = "(IIIIIZZI)V", line = 6256)
	static final void method25466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		if (!arg5 && (arg1 < 512 || arg2 < 512 || arg1 > (client.aClass517_1.method30411() - 2) * 512 || arg2 > (client.aClass517_1.method30417() - 2) * 512)) {
			@Pc(27) float[] local27 = client.aFloatArray96;
			client.aFloatArray96[1] = -1.0F;
			local27[0] = -1.0F;
			return;
		}
		@Pc(44) int local44 = Class277.method26658(arg1, arg2, arg0) - arg4;
		client.aClass455_51.method29387(Class284.aClass86_9.method20294());
		client.aClass455_51.method29436((float) arg3, 0.0F, 0.0F);
		Class284.aClass86_9.method20121(client.aClass455_51);
		if (arg5) {
			Class284.aClass86_9.method20148((float) arg1, (float) local44, (float) arg2, client.aFloatArray96);
		} else {
			Class284.aClass86_9.method20147((float) arg1, (float) local44, (float) arg2, client.aFloatArray96);
		}
		client.aClass455_51.method29436((float) -arg3, 0.0F, 0.0F);
		Class284.aClass86_9.method20121(client.aClass455_51);
		if (!arg6) {
			client.aFloatArray96[0] -= client.anInt3525 * -288443379;
			client.aFloatArray96[1] -= client.anInt3526 * 1082702717;
		}
	}

	@OriginalMember(owner = "client!ct", name = "km", descriptor = "(Lclient!yf;B)V", line = 6359)
	static final void method25467(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(19) byte[] local19 = new byte[] { (byte) arg0.anIntArray536[arg0.anInt5784 * 2088438307] };
		@Pc(35) byte[] local35 = new byte[] { (byte) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] };
		@Pc(45) int local45 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(49) Class277 local49 = Class155.method23628(local45);
		Class631.method32637(local49, local19, local35, arg0);
	}

	@OriginalMember(owner = "client!ct", name = "abi", descriptor = "(Lclient!yf;B)V", line = 9347)
	static final void method25468(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass77_Sub25_3.aByte57;
	}

	@OriginalMember(owner = "client!ct", name = "lp", descriptor = "(Lclient!gm;I)Z", line = 11786)
	static boolean method25469(@OriginalArg(0) Class277 arg0) {
		@Pc(2) Class77_Sub26 local2 = client.method25376(arg0);
		if (local2.method13654() > 0) {
			return true;
		} else if (local2.method13662()) {
			return true;
		} else {
			return arg0.aClass277_11 != null;
		}
	}
}
