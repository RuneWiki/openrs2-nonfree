package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acg")
public class Class13_Sub9 extends Class13 {

	@OriginalMember(owner = "client!acg", name = "a", descriptor = "Ljava/lang/String;")
	final String aString25;

	@OriginalMember(owner = "client!acg", name = "g", descriptor = "I")
	final int anInt614;

	@OriginalMember(owner = "client!acg", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 12)
	Class13_Sub9(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.aString25 = arg0.method20283();
		this.anInt614 = arg0.method20271() * 1748470633;
	}

	@OriginalMember(owner = "client!acg", name = "a", descriptor = "(I)V", line = 18)
	@Override
	public void method16888() {
		if (client.anInt3064 * 1358073379 != -1) {
			Class216.method24299(client.anInt3064 * 1358073379, this.aString25, this.anInt614 * 1344124121);
		}
	}

	@OriginalMember(owner = "client!acg", name = "h", descriptor = "()V", line = 18)
	@Override
	public void method16896() {
		if (client.anInt3064 * 1358073379 != -1) {
			Class216.method24299(client.anInt3064 * 1358073379, this.aString25, this.anInt614 * 1344124121);
		}
	}

	@OriginalMember(owner = "client!acg", name = "dw", descriptor = "(IB)V", line = 777)
	public static void method6252(@OriginalArg(0) int arg0) {
		@Pc(5) Class472 local5 = (Class472) Class58_Sub1.aHashMap3.get(arg0);
		if (local5 == null) {
			local5 = new Class472();
		}
		local5.anInt5119 = Class58_Sub1.anInt1438 * 216696365;
		local5.anInt5118 = Class58_Sub1.anInt1439 * 747886611;
		Class58_Sub1.aHashMap3.put(arg0, local5);
	}

	@OriginalMember(owner = "client!acg", name = "ih", descriptor = "(Lclient!vs;B)V", line = 5605)
	static final void method6251(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class559.method32842(local11, local14, arg0);
	}
}
