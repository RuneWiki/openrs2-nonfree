package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afj")
public class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!afj", name = "l", descriptor = "I")
	public final int anInt1174;

	@OriginalMember(owner = "client!afj", name = "h", descriptor = "I")
	public final int anInt1181;

	@OriginalMember(owner = "client!afj", name = "x", descriptor = "I")
	public final int anInt1173;

	@OriginalMember(owner = "client!afj", name = "b", descriptor = "I")
	public final int anInt1179;

	@OriginalMember(owner = "client!afj", name = "c", descriptor = "I")
	public final int anInt1180;

	@OriginalMember(owner = "client!afj", name = "s", descriptor = "I")
	public final int anInt1176;

	@OriginalMember(owner = "client!afj", name = "u", descriptor = "I")
	public final int anInt1177;

	@OriginalMember(owner = "client!afj", name = "y", descriptor = "I")
	public final int anInt1178;

	@OriginalMember(owner = "client!afj", name = "z", descriptor = "I")
	public final int anInt1175;

	@OriginalMember(owner = "client!afj", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 17)
	Class3_Sub6(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) int local5 = arg0.method20275();
		this.anInt1174 = (local5 >>> 28) * -1626396739;
		this.anInt1181 = (local5 >>> 14 & 0x3FFF) * 780928001;
		this.anInt1173 = (local5 & 0x3FFF) * 883980515;
		this.anInt1179 = arg0.method20269() * 1854377953;
		this.anInt1180 = arg0.method20269() * -1883155529;
		this.anInt1176 = arg0.method20269() * -703301771;
		this.anInt1177 = arg0.method20269() * -1834630361;
		this.anInt1178 = arg0.method20269() * 1788377453;
		this.anInt1175 = arg0.method20269() * -1483816707;
	}
}
