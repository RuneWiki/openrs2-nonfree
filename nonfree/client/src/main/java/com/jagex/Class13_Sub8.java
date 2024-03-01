package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acf")
public class Class13_Sub8 extends Class13 {

	@OriginalMember(owner = "client!acf", name = "a", descriptor = "I")
	final int anInt611;

	@OriginalMember(owner = "client!acf", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 9)
	Class13_Sub8(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt611 = arg0.method20271() * 1556722255;
	}

	@OriginalMember(owner = "client!acf", name = "a", descriptor = "(I)V", line = 14)
	@Override
	public void method16888() {
		Class131.aClass142Array1[this.anInt611 * -214686545].method23036();
	}

	@OriginalMember(owner = "client!acf", name = "h", descriptor = "()V", line = 14)
	@Override
	public void method16896() {
		Class131.aClass142Array1[this.anInt611 * -214686545].method23036();
	}

	@OriginalMember(owner = "client!acf", name = "d", descriptor = "(II)V", line = 615)
	static void method6238(@OriginalArg(0) int arg0) {
		if (arg0 == 26) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 4) {
					Class5_Sub3.method752();
				} else if (arg0 == 14) {
					Class215.method24289("" + Class390.anInt3019 * 1617726299);
				} else if (arg0 == 17) {
					@Pc(43) Class444 local43 = client.aClass370_1.method26950().aClass444_1;
					local43.aBoolean769 = !local43.aBoolean769;
				} else if (arg0 == 1) {
					client.aBoolean574 = true;
				} else if (arg0 == 24) {
					client.aBoolean574 = false;
				} else if (arg0 == 7) {
					client.aClass559_7.method32818();
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 21) {
						Class502.method29462();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
					} else if (arg0 == 25) {
						Class502.method29462();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
						Class334.method26291();
						Class502.method29462();
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
					} else if (arg0 == 27) {
						Class215.method24289(Class370.aClass417_1.method27789() ? "Success" : "Failure");
					} else if (arg0 == 6) {
						FileFilter_Sub1.aClass585_1.method33273();
					} else if (arg0 == 11) {
						Class117.aClass51_2.method9817();
					} else if (arg0 == 23) {
						Class117.aClass51_2.method9827();
					} else if (arg0 == 29) {
						Class106.aCanvas6.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class106.aCanvas6.setLocation(Class390.anInt3022 * 426445859, Class390.anInt3024 * 2076797327);
					} else if (arg0 == 13) {
						Class250.method25080();
					} else if (arg0 == 19) {
						client.aClass370_1.aLong267 = Class176.method23413() * -4368627482611790673L;
						client.aClass370_1.aBoolean728 = true;
						Class250.method25080();
					} else {
						@Pc(254) Class320 local254;
						if (arg0 == 10) {
							local254 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
							Class215.method24289(((int) local254.aFloat259 >> 9) + " " + ((int) local254.aFloat261 >> 9));
						} else if (arg0 == 9) {
							local254 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
							Class215.method24289("" + client.aClass370_1.method26950().aClass17Array3[Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101].method3548((int) local254.aFloat259 >> 9, (int) local254.aFloat261 >> 9));
						} else if (arg0 == 8) {
							Class215.method24289(Class178.aClass161_17.method23257() + " " + Class178.aClass161_17.method23225());
							Class215.method24289(Class178.aClass161_19.method23257() + " " + Class178.aClass161_19.method23225());
							Class215.method24289(Class44_Sub3.aClass596_1.aClass466_1.method28654() + " " + Class44_Sub3.aClass596_1.aClass466_1.method28653());
						} else if (arg0 == 15) {
							Class604.method33534(false);
						} else if (arg0 == 3) {
							client.aBoolean575 = !client.aBoolean575;
							Class613.aClass21_13.method17142(client.aBoolean575);
							Class201.method24153();
							return;
						} else if (arg0 == 28) {
							client.anInt3044 = 0;
							client.aClass370_1.method26968();
						} else if (arg0 == 16) {
							client.anInt3044 = -882018297;
							client.aClass370_1.method26968();
						} else if (arg0 == 20) {
							client.anInt3044 = -1764036594;
							client.aClass370_1.method26968();
						}
					}
				}
			} catch (@Pc(413) Exception local413) {
				Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
			}
		}
	}
}
