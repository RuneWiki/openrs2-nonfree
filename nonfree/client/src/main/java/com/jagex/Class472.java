package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public class Class472 {

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "Lclient!px;")
	final Class479 aClass479_1;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	final int anInt5000;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	final int anInt4999;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!akv;)V", line = 11)
	Class472(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass479_1 = (Class479) Class457.method29479(Class479.method29804(), arg0.method22478());
		this.anInt5000 = arg0.method22500() * 1966669819;
		if (Class479.aClass479_5 == this.aClass479_1) {
			this.anInt4999 = this.anInt5000 * -1795581509;
		} else {
			this.anInt4999 = arg0.method22500() * -926744743;
		}
	}

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "(I)Lclient!px;", line = 19)
	Class479 method29626() {
		return this.aClass479_1;
	}

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "()Lclient!px;", line = 19)
	Class479 method29627() {
		return this.aClass479_1;
	}

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "()I", line = 23)
	int method29628() {
		return this.anInt5000 * -250465485;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)I", line = 23)
	int method29629() {
		return this.anInt5000 * -250465485;
	}

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "()I", line = 23)
	int method29630() {
		return this.anInt5000 * -250465485;
	}

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "()I", line = 23)
	int method29631() {
		return this.anInt5000 * -250465485;
	}

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "()I", line = 23)
	int method29632() {
		return this.anInt5000 * -250465485;
	}

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "()I", line = 27)
	int method29633() {
		return this.anInt4999 * -1009297175;
	}

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "(I)I", line = 27)
	int method29634() {
		return this.anInt4999 * -1009297175;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(II)I", line = 184)
	public static int method29635(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return (local153 >> 1) + ((local143 & 0xFF) >> 2 << 10) + (local148 >> 5 << 7);
	}

	@OriginalMember(owner = "client!pq", name = "aqf", descriptor = "(Lclient!yf;B)V", line = 12383)
	static final void method29636(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1.method14963() == 2 ? 1 : 0;
	}
}
