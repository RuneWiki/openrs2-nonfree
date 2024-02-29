package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aky")
public class Class77_Sub41 extends Class77 {

	@OriginalMember(owner = "client!aky", name = "ab", descriptor = "I")
	static int anInt2007;

	@OriginalMember(owner = "client!aky", name = "q", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!aky", name = "y", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!aky", name = "w", descriptor = "Lclient!gm;")
	public Class277 aClass277_2;

	@OriginalMember(owner = "client!aky", name = "l", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray4;

	@OriginalMember(owner = "client!aky", name = "r", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!aky", name = "x", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!aky", name = "t", descriptor = "I")
	public int anInt2004;

	@OriginalMember(owner = "client!aky", name = "s", descriptor = "I")
	public int anInt2005;

	@OriginalMember(owner = "client!aky", name = "d", descriptor = "Lclient!gm;")
	public Class277 aClass277_3;

	@OriginalMember(owner = "client!aky", name = "g", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!aky", name = "z", descriptor = "I")
	int anInt2006;

	@OriginalMember(owner = "client!aky", name = "hy", descriptor = "(Lclient!yf;I)V", line = 5879)
	static final void method14836(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class385.method28342(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aky", name = "xy", descriptor = "(Lclient!yf;I)V", line = 8880)
	static final void method14837(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 2 && local12 < client.anInt3529 * -1979292205) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass162Array1[local12].anInt3263 * 1940141833;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!aky", name = "lc", descriptor = "(Lclient!aku;ZZI)V", line = 11906)
	public static final void method14838(@OriginalArg(0) Class77_Sub38 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.anInt3113 * 1225863589;
		@Pc(10) int local10 = (int) (arg0.aLong229 * 8258869577519436579L);
		arg0.method24063();
		if (arg1) {
			Class248.method26154(local4);
		}
		Class500.method30221(local4);
		@Pc(25) Class277 local25 = Class155.method23628(local10);
		if (local25 != null) {
			Class461.method29531(local25);
		}
		Class254.method26202(local4);
		if (!arg2 && client.anInt3459 * -993629849 != -1) {
			Class611.method32232(client.anInt3459 * -993629849, 1);
		}
		@Pc(52) Class19 local52 = new Class19(client.aClass12_20);
		for (@Pc(57) Class77_Sub38 local57 = (Class77_Sub38) local52.method397(); local57 != null; local57 = (Class77_Sub38) local52.next()) {
			if (!local57.method24066()) {
				local57 = (Class77_Sub38) local52.method397();
				if (local57 == null) {
					break;
				}
			}
			if (local57.anInt3114 * 410447 == 3) {
				@Pc(85) int local85 = (int) (local57.aLong229 * 8258869577519436579L);
				if (local4 == local85 >>> 16) {
					method14838(local57, true, arg2);
				}
			}
		}
	}
}
