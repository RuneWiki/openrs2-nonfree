package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeq")
public class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!aeq", name = "p", descriptor = "J")
	long aLong37 = 0L;

	@OriginalMember(owner = "client!aeq", name = "a", descriptor = "J")
	long aLong35 = 0L;

	@OriginalMember(owner = "client!aeq", name = "g", descriptor = "J")
	long aLong36 = 0L;

	@OriginalMember(owner = "client!aeq", name = "l", descriptor = "[J")
	long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!aeq", name = "h", descriptor = "I")
	int anInt1013 = 0;

	@OriginalMember(owner = "client!aeq", name = "x", descriptor = "I")
	int anInt1012 = 528295639;

	@OriginalMember(owner = "client!aeq", name = "<init>", descriptor = "()V", line = 15)
	Class47_Sub2() {
		this.aLong35 = (this.aLong37 = QueryPerformanceCounter.nanoTime() * -1603659946723367309L) * 1710621021093203441L;
		if (this.aLong37 * 1151508399184146107L == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aeq", name = "s", descriptor = "()V", line = 21)
	@Override
	void method9233() {
		this.aLong36 = 0L;
		if (this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L) {
			this.aLong37 += this.aLong35 * 2122375277213762321L - this.aLong37;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "u", descriptor = "()V", line = 21)
	@Override
	void method9225() {
		this.aLong36 = 0L;
		if (this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L) {
			this.aLong37 += this.aLong35 * 2122375277213762321L - this.aLong37;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "g", descriptor = "(I)V", line = 21)
	@Override
	void method9221() {
		this.aLong36 = 0L;
		if (this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L) {
			this.aLong37 += this.aLong35 * 2122375277213762321L - this.aLong37;
		}
	}

	@OriginalMember(owner = "client!aeq", name = "l", descriptor = "(I)J", line = 26)
	@Override
	long method9224() {
		this.aLong37 += this.method9239() * -1603659946723367309L;
		return this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L ? (this.aLong35 * -7958517757964825749L - this.aLong37 * 1151508399184146107L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aeq", name = "y", descriptor = "()J", line = 26)
	@Override
	long method9229() {
		this.aLong37 += this.method9239() * -1603659946723367309L;
		return this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L ? (this.aLong35 * -7958517757964825749L - this.aLong37 * 1151508399184146107L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aeq", name = "h", descriptor = "(J)I", line = 34)
	@Override
	int method9223(@OriginalArg(0) long arg0) {
		if (this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L) {
			this.aLong36 += this.aLong35 * 3523073061921386789L - this.aLong37 * 914504858402088149L;
			this.aLong37 += this.aLong35 * 2122375277213762321L - this.aLong37;
			this.aLong35 += arg0 * 5903389830756337987L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong35 += arg0 * 5903389830756337987L;
		} while (local49 < 10 && this.aLong35 * -7958517757964825749L < this.aLong37 * 1151508399184146107L);
		if (this.aLong35 * -7958517757964825749L < this.aLong37 * 1151508399184146107L) {
			this.aLong35 = this.aLong37 * 1710621021093203441L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aeq", name = "b", descriptor = "(J)I", line = 34)
	@Override
	int method9230(@OriginalArg(0) long arg0) {
		if (this.aLong35 * -7958517757964825749L > this.aLong37 * 1151508399184146107L) {
			this.aLong36 += this.aLong35 * 3523073061921386789L - this.aLong37 * 914504858402088149L;
			this.aLong37 += this.aLong35 * 2122375277213762321L - this.aLong37;
			this.aLong35 += arg0 * 5903389830756337987L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong35 += arg0 * 5903389830756337987L;
		} while (local49 < 10 && this.aLong35 * -7958517757964825749L < this.aLong37 * 1151508399184146107L);
		if (this.aLong35 * -7958517757964825749L < this.aLong37 * 1151508399184146107L) {
			this.aLong35 = this.aLong37 * 1710621021093203441L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!aeq", name = "x", descriptor = "(S)J", line = 52)
	@Override
	long method9226() {
		return this.aLong37 * 1151508399184146107L;
	}

	@OriginalMember(owner = "client!aeq", name = "c", descriptor = "()J", line = 52)
	@Override
	long method9234() {
		return this.aLong37 * 1151508399184146107L;
	}

	@OriginalMember(owner = "client!aeq", name = "z", descriptor = "()J", line = 52)
	@Override
	long method9232() {
		return this.aLong37 * 1151508399184146107L;
	}

	@OriginalMember(owner = "client!aeq", name = "m", descriptor = "()J", line = 56)
	long method9238() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong36 * -8204107495305867953L;
		this.aLong36 = local1 * 8699967177669372335L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray4[this.anInt1013 * 1228357103] = local8;
			this.anInt1013 = (this.anInt1013 * 1228357103 + 1) % 10 * 1849790735;
			if (this.anInt1012 * -601674521 < 1) {
				this.anInt1012 += 528295639;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1012 * -601674521; local57++) {
			local55 += this.aLongArray4[(this.anInt1013 * 1228357103 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1012 * -601674521);
	}

	@OriginalMember(owner = "client!aeq", name = "q", descriptor = "(B)J", line = 56)
	long method9239() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong36 * -8204107495305867953L;
		this.aLong36 = local1 * 8699967177669372335L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray4[this.anInt1013 * 1228357103] = local8;
			this.anInt1013 = (this.anInt1013 * 1228357103 + 1) % 10 * 1849790735;
			if (this.anInt1012 * -601674521 < 1) {
				this.anInt1012 += 528295639;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1012 * -601674521; local57++) {
			local55 += this.aLongArray4[(this.anInt1013 * 1228357103 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1012 * -601674521);
	}
}
