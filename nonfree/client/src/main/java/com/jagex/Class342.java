package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public class Class342 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	static final int anInt4479 = 11;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	static final int anInt4480 = -16777216;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	static final int anInt4481 = 5;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	static final int anInt4482 = 2048;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!pw;")
	static Class478 aClass478_100;

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
	int anInt4478;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
	int anInt4483;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream1;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "(Ljava/io/InputStream;I)V", line = 15)
	public final void method27766(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "(Ljava/io/InputStream;)V", line = 15)
	public final void method27767(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "(Ljava/io/InputStream;)V", line = 15)
	public final void method27768(@OriginalArg(0) InputStream arg0) {
		this.anInputStream1 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 19)
	public final void method27769() {
		this.anInputStream1 = null;
	}

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "()V", line = 19)
	public final void method27770() {
		this.anInputStream1 = null;
	}

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "(B)V", line = 23)
	public final void method27771() throws IOException {
		this.anInt4483 = 0;
		this.anInt4478 = 810237293;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "()V", line = 23)
	public final void method27772() throws IOException {
		this.anInt4483 = 0;
		this.anInt4478 = 810237293;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
		}
	}

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "()V", line = 23)
	public final void method27773() throws IOException {
		this.anInt4483 = 0;
		this.anInt4478 = 810237293;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
		}
	}

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "(II)I", line = 29)
	public final int method27774(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4478 = (this.anInt4478 * 1909631899 >>> 1) * -810237293;
			@Pc(28) int local28 = this.anInt4483 * -11123325 - this.anInt4478 * 1909631899 >>> 31;
			this.anInt4483 -= (this.anInt4478 * 1909631899 & local28 - 1) * 1812394283;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
				this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
				this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "(I)I", line = 29)
	public final int method27775(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4478 = (this.anInt4478 * 1909631899 >>> 1) * -810237293;
			@Pc(28) int local28 = this.anInt4483 * -11123325 - this.anInt4478 * 1909631899 >>> 31;
			this.anInt4483 -= (this.anInt4478 * 1909631899 & local28 - 1) * 1812394283;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
				this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
				this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)I", line = 29)
	public final int method27776(@OriginalArg(0) int arg0) throws IOException {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = arg0; local3 != 0; local3--) {
			this.anInt4478 = (this.anInt4478 * 1909631899 >>> 1) * -810237293;
			@Pc(28) int local28 = this.anInt4483 * -11123325 - this.anInt4478 * 1909631899 >>> 31;
			this.anInt4483 -= (this.anInt4478 * 1909631899 & local28 - 1) * 1812394283;
			local1 = local1 << 1 | 1 - local28;
			if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
				this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
				this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "([SI)I", line = 44)
	public int method27777(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = local3 * (this.anInt4478 * 1909631899 >>> 11);
		if ((this.anInt4483 * -11123325 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4478 = local12 * -810237293;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
				this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
				this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
			}
			return 0;
		}
		this.anInt4478 -= local12 * -810237293;
		this.anInt4483 -= local12 * 1812394283;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
			this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
			this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "([SI)I", line = 44)
	public int method27778(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = local3 * (this.anInt4478 * 1909631899 >>> 11);
		if ((this.anInt4483 * -11123325 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4478 = local12 * -810237293;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
				this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
				this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
			}
			return 0;
		}
		this.anInt4478 -= local12 * -810237293;
		this.anInt4483 -= local12 * 1812394283;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
			this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
			this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "([SII)I", line = 44)
	public int method27779(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(3) short local3 = arg0[arg1];
		@Pc(12) int local12 = local3 * (this.anInt4478 * 1909631899 >>> 11);
		if ((this.anInt4483 * -11123325 ^ Integer.MIN_VALUE) < (local12 ^ Integer.MIN_VALUE)) {
			this.anInt4478 = local12 * -810237293;
			arg0[arg1] = (short) (local3 + (2048 - local3 >>> 5));
			if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
				this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
				this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
			}
			return 0;
		}
		this.anInt4478 -= local12 * -810237293;
		this.anInt4483 -= local12 * 1812394283;
		arg0[arg1] = (short) (local3 - (local3 >>> 5));
		if ((this.anInt4478 * 1909631899 & 0xFF000000) == 0) {
			this.anInt4483 = (this.anInt4483 * -11123325 << 8 | this.anInputStream1.read()) * 1812394283;
			this.anInt4478 = (this.anInt4478 * 1909631899 << 8) * -810237293;
		}
		return 1;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "([BII)I", line = 54)
	public static int method27780(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class526.method30674(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "([S)V", line = 68)
	public static void method27781(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "([S)V", line = 68)
	public static void method27782(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "([S)V", line = 68)
	public static void method27783(@OriginalArg(0) short[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!jh", name = "ar", descriptor = "(Lclient!yf;I)V", line = 4477)
	static final void method27784(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		if (arg0.anIntArray536[arg0.anInt5784 * 2088438307] >= arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!jh", name = "anv", descriptor = "(Lclient!yf;I)V", line = 11985)
	static final void method27785(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3390 * -1850530127 == 13) {
			@Pc(11) Class77_Sub20 local11 = Class365.method28132(Class414.aClass414_19, client.aClass82_1.aClass16_1);
			client.aClass82_1.method2004(local11);
		}
	}
}
