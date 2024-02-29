package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public class Class274 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gi", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "(Lclient!akv;[Lclient!qu;I)[Ljava/lang/Object;", line = 20)
	public static Object[] method26547(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class498[] arg1) {
		@Pc(3) int local3 = arg0.method22537();
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local16 + arg1.length * local11;
				local9[local27] = arg1[local16].aClass489_7.method30013(arg0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!fc;)V", line = 259)
	Class274(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "(Lclient!fd;I)V", line = 262)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26088();
	}

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "(Lclient!fd;)V", line = 262)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26088();
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(Lclient!fd;)V", line = 262)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26088();
	}

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "(Lclient!uq;IILclient!yf;I)V", line = 306)
	static void method26548(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class665 arg3) {
		@Pc(5) Class77_Sub1_Sub9 local5 = Class438.method28917(arg0, arg1, arg2);
		if (local5 == null) {
			Class538.method30878();
			return;
		}
		arg3.anIntArray537 = new int[local5.anInt3012 * -39710947];
		arg3.anObjectArray46 = new Object[local5.anInt3013 * 1127446605];
		if (Class135.aClass135_38 == local5.aClass135_45 || local5.aClass135_45 == Class135.aClass135_30 || Class135.aClass135_29 == local5.aClass135_45) {
			arg3.anIntArray537[0] = arg1;
			arg3.anIntArray537[1] = Class60.aClass138_1.method14234();
			arg3.anIntArray537[2] = Class60.aClass138_1.method14225();
		} else if (Class135.aClass135_24 == local5.aClass135_45 || local5.aClass135_45 == Class135.aClass135_34 || Class135.aClass135_25 == local5.aClass135_45 || Class135.aClass135_23 == local5.aClass135_45 || Class135.aClass135_43 == local5.aClass135_45) {
			arg3.anIntArray537[0] = arg1;
		} else if (local5.aClass135_45 == Class135.aClass135_36) {
			arg3.anIntArray537[0] = arg3.anInt5785 * -1668647199;
		}
		Class320.method27452(local5, 500000, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "fa", descriptor = "(I)V", line = 2330)
	static void method26549() {
		@Pc(2) client local2 = Class695.aClient1;
		synchronized (Class695.aClient1) {
			if (Class184.aFrame1 == null) {
				@Pc(11) Container local11 = Class94.method7650();
				if (local11 != null) {
					Class402.anInt4694 = local11.getSize().width * 1199809921;
					client.anInt3365 = local11.getSize().height * 226957979;
					@Pc(34) Insets local34;
					if (Class460.aFrame2 == local11) {
						local34 = Class460.aFrame2.getInsets();
						Class402.anInt4694 -= (local34.left + local34.right) * 1199809921;
						client.anInt3365 -= (local34.top + local34.bottom) * 226957979;
					}
					if (Class402.anInt4694 * -166028671 <= 0) {
						Class402.anInt4694 = 1199809921;
					}
					if (client.anInt3365 * 8272787 <= 0) {
						client.anInt3365 = 226957979;
					}
					if (Class569.method31421() == 1) {
						Class149_Sub4.anInt2368 = client.anInt3394 * 1860177489;
						client.anInt3366 = (Class402.anInt4694 * -166028671 - -321474631 * client.anInt3394) / 2 * -138655283;
						Class19.anInt108 = client.anInt3464 * -1350390103;
						client.anInt3367 = 0;
					} else {
						Class152.method17450();
					}
					if (Class661.aClass661_5 != client.aClass661_1 && Class149_Sub4.anInt2368 * 1771907305 < 1024 && Class19.anInt108 * -1091172141 < 768) {
					}
					Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
					if (Class284.aClass86_9 != null) {
						Class284.aClass86_9.method19965(Class470.aCanvas6, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
						Class483.method29837(Class284.aClass86_9, Class280.method26667());
					}
					if (Class460.aFrame2 == local11) {
						local34 = Class460.aFrame2.getInsets();
						Class470.aCanvas6.setLocation(local34.left + client.anInt3366 * -721302779, client.anInt3367 * -350211099 + local34.top);
					} else {
						Class470.aCanvas6.setLocation(client.anInt3366 * -721302779, client.anInt3367 * -350211099);
					}
					Class77_Sub28.method13745();
					if (client.anInt3459 * -993629849 != -1) {
						Class290.method27000(true);
					}
					Class320.method27454();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "aza", descriptor = "(Lclient!yf;B)V", line = 13790)
	static final void method26550(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class205.aClass299_1.method27089(local13);
	}
}
