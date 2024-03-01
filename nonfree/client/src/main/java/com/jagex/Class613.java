package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yz")
public class Class613 implements Interface49 {

	@OriginalMember(owner = "client!yz", name = "cf", descriptor = "Lclient!de;")
	public static Class21 aClass21_13;

	@OriginalMember(owner = "client!yz", name = "oi", descriptor = "Z")
	public static boolean aBoolean849;

	@OriginalMember(owner = "client!yz", name = "z", descriptor = "I")
	protected static int anInt5546;

	@OriginalMember(owner = "client!yz", name = "a", descriptor = "I")
	int anInt5540;

	@OriginalMember(owner = "client!yz", name = "l", descriptor = "I")
	int anInt5541;

	@OriginalMember(owner = "client!yz", name = "p", descriptor = "I")
	int anInt5542;

	@OriginalMember(owner = "client!yz", name = "x", descriptor = "I")
	int anInt5543;

	@OriginalMember(owner = "client!yz", name = "h", descriptor = "I")
	int anInt5544;

	@OriginalMember(owner = "client!yz", name = "g", descriptor = "I")
	int anInt5545;

	@OriginalMember(owner = "client!yz", name = "s", descriptor = "Z")
	boolean aBoolean848;

	@OriginalMember(owner = "client!yz", name = "<init>", descriptor = "()V", line = 212)
	Class613() {
	}

	@OriginalMember(owner = "client!yz", name = "l", descriptor = "()J", line = 215)
	@Override
	public long method33644() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt5542 * 767341579)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt5540 * -1626843853 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt5540 * -1626843853)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt5545 * -518570345 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt5545 * -518570345 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt5545 * -518570345 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt5545 * -518570345)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt5541 * -456981841)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt5544 * -1756548903 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt5544 * -1756548903 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt5544 * -1756548903 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt5544 * -1756548903)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt5543 * 1445850451)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean848 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!yz", name = "p", descriptor = "()J", line = 215)
	@Override
	public long method33645() {
		@Pc(1) long[] local1 = Class3_Sub41.aLongArray8;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt5542 * 767341579)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt5540 * -1626843853 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt5540 * -1626843853)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt5545 * -518570345 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt5545 * -518570345 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt5545 * -518570345 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt5545 * -518570345)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt5541 * -456981841)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt5544 * -1756548903 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt5544 * -1756548903 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt5544 * -1756548903 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt5544 * -1756548903)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt5543 * 1445850451)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean848 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!yz", name = "a", descriptor = "(Lclient!sa;)Z", line = 235)
	@Override
	public boolean method33647(@OriginalArg(0) Interface49 arg0) {
		if (!(arg0 instanceof Class613)) {
			return false;
		}
		@Pc(7) Class613 local7 = (Class613) arg0;
		if (this.anInt5542 * 767341579 != local7.anInt5542 * 767341579) {
			return false;
		} else if (local7.anInt5540 * -1626843853 != this.anInt5540 * -1626843853) {
			return false;
		} else if (this.anInt5545 * -518570345 != local7.anInt5545 * -518570345) {
			return false;
		} else if (this.anInt5541 * -456981841 != local7.anInt5541 * -456981841) {
			return false;
		} else if (this.anInt5544 * -1756548903 != local7.anInt5544 * -1756548903) {
			return false;
		} else if (local7.anInt5543 * 1445850451 == this.anInt5543 * 1445850451) {
			return local7.aBoolean848 == this.aBoolean848;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!yz", name = "g", descriptor = "(Lclient!sa;)Z", line = 235)
	@Override
	public boolean method33646(@OriginalArg(0) Interface49 arg0) {
		if (!(arg0 instanceof Class613)) {
			return false;
		}
		@Pc(7) Class613 local7 = (Class613) arg0;
		if (this.anInt5542 * 767341579 != local7.anInt5542 * 767341579) {
			return false;
		} else if (local7.anInt5540 * -1626843853 != this.anInt5540 * -1626843853) {
			return false;
		} else if (this.anInt5545 * -518570345 != local7.anInt5545 * -518570345) {
			return false;
		} else if (this.anInt5541 * -456981841 != local7.anInt5541 * -456981841) {
			return false;
		} else if (this.anInt5544 * -1756548903 != local7.anInt5544 * -1756548903) {
			return false;
		} else if (local7.anInt5543 * 1445850451 == this.anInt5543 * 1445850451) {
			return local7.aBoolean848 == this.aBoolean848;
		} else {
			return false;
		}
	}
}
