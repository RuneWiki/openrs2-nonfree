package com.jagex;

import java.awt.Dimension;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abn")
class Class38 implements Iterator {

	@OriginalMember(owner = "client!abn", name = "p", descriptor = "I")
	int anInt137;

	// $FF: synthetic field
	@OriginalMember(owner = "client!abn", name = "this$0", descriptor = "Lclient!abk;")
	final Class35 this$0;

	@OriginalMember(owner = "client!abn", name = "<init>", descriptor = "(Lclient!abk;)V", line = 82)
	Class38(@OriginalArg(0) Class35 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!abn", name = "hasNext", descriptor = "()Z", line = 86)
	@Override
	public boolean hasNext() {
		return this.anInt137 * -2079474101 < this.this$0.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abn", name = "l", descriptor = "()Z", line = 86)
	public boolean method659() {
		return this.anInt137 * -2079474101 < this.this$0.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abn", name = "c", descriptor = "()Z", line = 86)
	public boolean method660() {
		return this.anInt137 * -2079474101 < this.this$0.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abn", name = "v", descriptor = "()Z", line = 86)
	public boolean method661() {
		return this.anInt137 * -2079474101 < this.this$0.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abn", name = "p", descriptor = "()Z", line = 86)
	public boolean method662() {
		return this.anInt137 * -2079474101 < this.this$0.anInt2544 * 888398261;
	}

	@OriginalMember(owner = "client!abn", name = "next", descriptor = "()Ljava/lang/Object;", line = 90)
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt137 += 711498595) * -2079474101 - 1;
		@Pc(16) Class232 local16 = this.this$0.aClass232_62;
		synchronized (this.this$0.aClass232_62) {
			@Pc(25) Interface12 local25 = (Interface12) this.this$0.aClass232_62.method25835((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.this$0.method18322(local11);
	}

	@OriginalMember(owner = "client!abn", name = "y", descriptor = "()Ljava/lang/Object;", line = 90)
	public Object method663() {
		@Pc(11) int local11 = (this.anInt137 += 711498595) * -2079474101 - 1;
		@Pc(16) Class232 local16 = this.this$0.aClass232_62;
		synchronized (this.this$0.aClass232_62) {
			@Pc(25) Interface12 local25 = (Interface12) this.this$0.aClass232_62.method25835((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.this$0.method18322(local11);
	}

	@OriginalMember(owner = "client!abn", name = "w", descriptor = "()Ljava/lang/Object;", line = 90)
	public Object method664() {
		@Pc(11) int local11 = (this.anInt137 += 711498595) * -2079474101 - 1;
		@Pc(16) Class232 local16 = this.this$0.aClass232_62;
		synchronized (this.this$0.aClass232_62) {
			@Pc(25) Interface12 local25 = (Interface12) this.this$0.aClass232_62.method25835((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.this$0.method18322(local11);
	}

	@OriginalMember(owner = "client!abn", name = "q", descriptor = "()V", line = 99)
	public void method665() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!abn", name = "remove", descriptor = "()V", line = 99)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!abn", name = "t", descriptor = "()V", line = 99)
	public void method666() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!abn", name = "fo", descriptor = "(III)I", line = 2181)
	public static int method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class617.aClass629_1.anInt5689 * -1085389923 == -1) {
			return 1;
		}
		if (arg0 != Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109()) {
			Class307.method27255(arg0, Class44.aClass44_99.method713(Class128.aClass667_3), true);
			if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Class470.aCanvas6.getSize();
			Class685.method36274(Class44.aClass44_99.method713(Class128.aClass667_3), true, Class284.aClass86_9, Class128_Sub1.aClass94_5, Class611.aClass17_13);
			@Pc(50) Class216 local50 = Class216.method25655(Class173.aClass478_87, Class617.aClass629_1.anInt5689 * -1085389923, 0);
			@Pc(53) long local53 = Class280.method26667();
			Class284.aClass86_9.method20299();
			client.aClass455_51.method29428(0.0F, 256.0F, 0.0F);
			Class284.aClass86_9.method20121(client.aClass455_51);
			@Pc(66) Class442 local66 = Class284.aClass86_9.method20282();
			local66.method29006((float) (local32.width / 2), (float) (local32.height / 2), 512.0F, 512.0F, (float) client.aClass517_1.method30426(), (float) client.aClass517_1.method30431(), (float) local32.width, (float) local32.height);
			Class284.aClass86_9.method20123(local66);
			Class284.aClass86_9.method20255(1.0F);
			Class284.aClass86_9.method20126(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(116) Class84 local116 = Class284.aClass86_9.method20115(local50, 2048, 64, 64, 768);
			@Pc(118) int local118 = 0;
			label42: for (@Pc(120) int local120 = 0; local120 < 500; local120++) {
				Class284.aClass86_9.method20125(3, 0);
				for (@Pc(129) int local129 = 15; local129 >= 0; local129--) {
					for (@Pc(133) int local133 = 0; local133 <= local129; local133++) {
						client.aClass455_52.method29428((float) (((float) local133 - (float) local129 / 2.0F) * 512.0F), 0.0F, (float) ((local129 + 1) * 512));
						local116.method6813(client.aClass455_52, null, 0);
						local118++;
						if (Class280.method26667() - local53 >= (long) arg1) {
							break label42;
						}
					}
				}
			}
			Class284.aClass86_9.method20331();
			@Pc(189) long local189 = (long) (local118 * 1000) / (Class280.method26667() - local53);
			Class284.aClass86_9.method20125(3, 0);
			return (int) local189;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "ui", descriptor = "(Lclient!yf;B)V", line = 8280)
	static final void method668(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class94_Sub4.aClass261_1.method26305(local13, local23);
	}

	@OriginalMember(owner = "client!abn", name = "ll", descriptor = "(Ljava/lang/String;B)Z", line = 11960)
	public static boolean method669(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < client.anInt3529 * -1979292205; local6++) {
			if (arg0.equalsIgnoreCase(client.aClass162Array1[local6].aString131)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
			return true;
		} else {
			return false;
		}
	}
}
