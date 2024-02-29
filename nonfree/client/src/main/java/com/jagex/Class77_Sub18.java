package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajr")
public class Class77_Sub18 extends Class77 {

	@OriginalMember(owner = "client!ajr", name = "l", descriptor = "I")
	public final int anInt1514;

	@OriginalMember(owner = "client!ajr", name = "y", descriptor = "I")
	public final int anInt1509;

	@OriginalMember(owner = "client!ajr", name = "w", descriptor = "I")
	public final int anInt1510;

	@OriginalMember(owner = "client!ajr", name = "d", descriptor = "I")
	public final int anInt1513;

	@OriginalMember(owner = "client!ajr", name = "s", descriptor = "I")
	public final int anInt1515;

	@OriginalMember(owner = "client!ajr", name = "t", descriptor = "I")
	public final int anInt1511;

	@OriginalMember(owner = "client!ajr", name = "q", descriptor = "I")
	public final int anInt1516;

	@OriginalMember(owner = "client!ajr", name = "x", descriptor = "I")
	public final int anInt1508;

	@OriginalMember(owner = "client!ajr", name = "r", descriptor = "I")
	public final int anInt1512;

	@OriginalMember(owner = "client!ajr", name = "<init>", descriptor = "(Lclient!akv;)V", line = 17)
	Class77_Sub18(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) int local5 = arg0.method22500();
		this.anInt1514 = (local5 >>> 28) * -1087455833;
		this.anInt1509 = (local5 >>> 14 & 0x3FFF) * 52449129;
		this.anInt1510 = (local5 & 0x3FFF) * -21357985;
		this.anInt1513 = arg0.method22478() * 1089743733;
		this.anInt1515 = arg0.method22478() * -2056302421;
		this.anInt1511 = arg0.method22478() * 682144289;
		this.anInt1516 = arg0.method22478() * 1920524889;
		this.anInt1508 = arg0.method22478() * -764612805;
		this.anInt1512 = arg0.method22478() * 174675339;
	}
}
