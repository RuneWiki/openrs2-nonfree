package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public class Class297 {

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "Ljava/lang/String;")
	String aString185;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!hd;")
	Class295 aClass295_132;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "[I")
	public int[] anIntArray416;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!hd;")
	Class295 aClass295_133;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Ljava/lang/String;")
	String aString186;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
	int anInt4013 = 1907914005;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 58)
	Class297() {
	}

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "(Lclient!hc;I)V", line = 61)
	void method27052(@OriginalArg(0) Class294 arg0) {
		@Pc(3) int local3 = arg0.method27023();
		this.aClass295_133 = Class648.method32860()[local3];
		@Pc(17) int local17;
		if (Class295.aClass295_9 == this.aClass295_133) {
			local17 = arg0.method27023();
			this.aClass295_132 = Class648.method32860()[local17];
			this.anInt4013 = arg0.method27023() * -1907914005;
		}
		this.aString186 = arg0.method27025();
		this.aString185 = arg0.method27025();
		local17 = arg0.method27023();
		this.anIntArray417 = new int[local17];
		this.anIntArray416 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray417[local54] = arg0.method27023();
			this.anIntArray416[local54] = arg0.method27023();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(Lclient!hc;)V", line = 61)
	void method27053(@OriginalArg(0) Class294 arg0) {
		@Pc(3) int local3 = arg0.method27023();
		this.aClass295_133 = Class648.method32860()[local3];
		@Pc(17) int local17;
		if (Class295.aClass295_9 == this.aClass295_133) {
			local17 = arg0.method27023();
			this.aClass295_132 = Class648.method32860()[local17];
			this.anInt4013 = arg0.method27023() * -1907914005;
		}
		this.aString186 = arg0.method27025();
		this.aString185 = arg0.method27025();
		local17 = arg0.method27023();
		this.anIntArray417 = new int[local17];
		this.anIntArray416 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray417[local54] = arg0.method27023();
			this.anIntArray416[local54] = arg0.method27023();
		}
	}

	@OriginalMember(owner = "client!hf", name = "ky", descriptor = "(Lclient!yf;I)V", line = 6480)
	static final void method27054(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class130.method12485(local16, arg0);
	}
}
