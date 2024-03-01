package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahc")
public class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!ahc", name = "r", descriptor = "I")
	static final int anInt1368 = 10;

	@OriginalMember(owner = "client!ahc", name = "ar", descriptor = "I")
	public static int anInt1371;

	@OriginalMember(owner = "client!ahc", name = "v", descriptor = "[I")
	int[] anIntArray187;

	@OriginalMember(owner = "client!ahc", name = "t", descriptor = "I")
	int anInt1369;

	@OriginalMember(owner = "client!ahc", name = "d", descriptor = "[[B")
	final byte[][] aByteArrayArray10 = new byte[10][];

	@OriginalMember(owner = "client!ahc", name = "w", descriptor = "Lclient!ahb;")
	final Class3_Sub41 aClass3_Sub41_9 = new Class3_Sub41(null);

	@OriginalMember(owner = "client!ahc", name = "o", descriptor = "Lclient!ahb;")
	final Class3_Sub41 aClass3_Sub41_8 = new Class3_Sub41(null);

	@OriginalMember(owner = "client!ahc", name = "q", descriptor = "Lclient!ny;")
	final Class359 aClass359_18;

	@OriginalMember(owner = "client!ahc", name = "m", descriptor = "I")
	final int anInt1370;

	@OriginalMember(owner = "client!ahc", name = "<init>", descriptor = "(ILclient!ny;I)V", line = 19)
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass359_18 = arg1;
		this.anInt1370 = arg2 * -126908339;
	}

	@OriginalMember(owner = "client!ahc", name = "d", descriptor = "([B)I", line = 25)
	@Override
	int method12240(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(45) int local45;
		@Pc(51) int local51;
		if (this.anIntArray187 == null) {
			if (!this.aClass359_18.method26673(this.anInt1370 * -1705054075, 0)) {
				return 0;
			}
			@Pc(24) byte[] local24 = this.aClass359_18.method26713(this.anInt1370 * -1705054075, 0);
			if (local24 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub41_8.aByteArray51 = local24;
			this.aClass3_Sub41_8.anInt2803 = 0;
			local45 = local24.length >> 1;
			this.anIntArray187 = new int[local45];
			for (local51 = 0; local51 < local45; local51++) {
				this.anIntArray187[local51] = this.aClass3_Sub41_8.method20271();
			}
		}
		if (this.anInt1369 * 93738467 >= this.anIntArray187.length) {
			return -1;
		}
		this.method12279();
		this.aClass3_Sub41_8.aByteArray51 = arg0;
		this.aClass3_Sub41_8.anInt2803 = 0;
		do {
			if (this.aClass3_Sub41_8.anInt2803 * 62066237 >= this.aClass3_Sub41_8.aByteArray51.length) {
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub41_9.aByteArray51 == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass3_Sub41_8.aByteArray51 = null;
					return this.aClass3_Sub41_8.anInt2803 * 62066237;
				}
				this.aClass3_Sub41_9.aByteArray51 = this.aByteArrayArray10[0];
			}
			@Pc(133) int local133 = this.aClass3_Sub41_8.aByteArray51.length - this.aClass3_Sub41_8.anInt2803 * 62066237;
			local45 = this.aClass3_Sub41_9.aByteArray51.length - this.aClass3_Sub41_9.anInt2803 * 62066237;
			if (local133 < local45) {
				this.aClass3_Sub41_9.method20286(this.aClass3_Sub41_8.aByteArray51, this.aClass3_Sub41_8.anInt2803 * 62066237, local133);
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			this.aClass3_Sub41_8.method20248(this.aClass3_Sub41_9.aByteArray51, this.aClass3_Sub41_9.anInt2803 * 62066237, local45);
			this.aClass3_Sub41_9.aByteArray51 = null;
			this.aClass3_Sub41_9.anInt2803 = 0;
			this.anInt1369 += 673945547;
			for (local51 = 0; local51 < 9; local51++) {
				this.aByteArrayArray10[local51] = this.aByteArrayArray10[local51 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anInt1369 * 93738467 < this.anIntArray187.length);
		this.aClass3_Sub41_8.aByteArray51 = null;
		return this.aClass3_Sub41_8.anInt2803 * 62066237;
	}

	@OriginalMember(owner = "client!ahc", name = "p", descriptor = "([BI)I", line = 25)
	@Override
	int method12224(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(45) int local45;
		@Pc(51) int local51;
		if (this.anIntArray187 == null) {
			if (!this.aClass359_18.method26673(this.anInt1370 * -1705054075, 0)) {
				return 0;
			}
			@Pc(24) byte[] local24 = this.aClass359_18.method26713(this.anInt1370 * -1705054075, 0);
			if (local24 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub41_8.aByteArray51 = local24;
			this.aClass3_Sub41_8.anInt2803 = 0;
			local45 = local24.length >> 1;
			this.anIntArray187 = new int[local45];
			for (local51 = 0; local51 < local45; local51++) {
				this.anIntArray187[local51] = this.aClass3_Sub41_8.method20271();
			}
		}
		if (this.anInt1369 * 93738467 >= this.anIntArray187.length) {
			return -1;
		}
		this.method12279();
		this.aClass3_Sub41_8.aByteArray51 = arg0;
		this.aClass3_Sub41_8.anInt2803 = 0;
		do {
			if (this.aClass3_Sub41_8.anInt2803 * 62066237 >= this.aClass3_Sub41_8.aByteArray51.length) {
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub41_9.aByteArray51 == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass3_Sub41_8.aByteArray51 = null;
					return this.aClass3_Sub41_8.anInt2803 * 62066237;
				}
				this.aClass3_Sub41_9.aByteArray51 = this.aByteArrayArray10[0];
			}
			@Pc(133) int local133 = this.aClass3_Sub41_8.aByteArray51.length - this.aClass3_Sub41_8.anInt2803 * 62066237;
			local45 = this.aClass3_Sub41_9.aByteArray51.length - this.aClass3_Sub41_9.anInt2803 * 62066237;
			if (local133 < local45) {
				this.aClass3_Sub41_9.method20286(this.aClass3_Sub41_8.aByteArray51, this.aClass3_Sub41_8.anInt2803 * 62066237, local133);
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			this.aClass3_Sub41_8.method20248(this.aClass3_Sub41_9.aByteArray51, this.aClass3_Sub41_9.anInt2803 * 62066237, local45);
			this.aClass3_Sub41_9.aByteArray51 = null;
			this.aClass3_Sub41_9.anInt2803 = 0;
			this.anInt1369 += 673945547;
			for (local51 = 0; local51 < 9; local51++) {
				this.aByteArrayArray10[local51] = this.aByteArrayArray10[local51 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anInt1369 * 93738467 < this.anIntArray187.length);
		this.aClass3_Sub41_8.aByteArray51 = null;
		return this.aClass3_Sub41_8.anInt2803 * 62066237;
	}

	@OriginalMember(owner = "client!ahc", name = "q", descriptor = "([B)I", line = 25)
	@Override
	int method12241(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(45) int local45;
		@Pc(51) int local51;
		if (this.anIntArray187 == null) {
			if (!this.aClass359_18.method26673(this.anInt1370 * -1705054075, 0)) {
				return 0;
			}
			@Pc(24) byte[] local24 = this.aClass359_18.method26713(this.anInt1370 * -1705054075, 0);
			if (local24 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub41_8.aByteArray51 = local24;
			this.aClass3_Sub41_8.anInt2803 = 0;
			local45 = local24.length >> 1;
			this.anIntArray187 = new int[local45];
			for (local51 = 0; local51 < local45; local51++) {
				this.anIntArray187[local51] = this.aClass3_Sub41_8.method20271();
			}
		}
		if (this.anInt1369 * 93738467 >= this.anIntArray187.length) {
			return -1;
		}
		this.method12279();
		this.aClass3_Sub41_8.aByteArray51 = arg0;
		this.aClass3_Sub41_8.anInt2803 = 0;
		do {
			if (this.aClass3_Sub41_8.anInt2803 * 62066237 >= this.aClass3_Sub41_8.aByteArray51.length) {
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub41_9.aByteArray51 == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass3_Sub41_8.aByteArray51 = null;
					return this.aClass3_Sub41_8.anInt2803 * 62066237;
				}
				this.aClass3_Sub41_9.aByteArray51 = this.aByteArrayArray10[0];
			}
			@Pc(133) int local133 = this.aClass3_Sub41_8.aByteArray51.length - this.aClass3_Sub41_8.anInt2803 * 62066237;
			local45 = this.aClass3_Sub41_9.aByteArray51.length - this.aClass3_Sub41_9.anInt2803 * 62066237;
			if (local133 < local45) {
				this.aClass3_Sub41_9.method20286(this.aClass3_Sub41_8.aByteArray51, this.aClass3_Sub41_8.anInt2803 * 62066237, local133);
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			this.aClass3_Sub41_8.method20248(this.aClass3_Sub41_9.aByteArray51, this.aClass3_Sub41_9.anInt2803 * 62066237, local45);
			this.aClass3_Sub41_9.aByteArray51 = null;
			this.aClass3_Sub41_9.anInt2803 = 0;
			this.anInt1369 += 673945547;
			for (local51 = 0; local51 < 9; local51++) {
				this.aByteArrayArray10[local51] = this.aByteArrayArray10[local51 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anInt1369 * 93738467 < this.anIntArray187.length);
		this.aClass3_Sub41_8.aByteArray51 = null;
		return this.aClass3_Sub41_8.anInt2803 * 62066237;
	}

	@OriginalMember(owner = "client!ahc", name = "r", descriptor = "([B)I", line = 25)
	@Override
	int method12269(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(45) int local45;
		@Pc(51) int local51;
		if (this.anIntArray187 == null) {
			if (!this.aClass359_18.method26673(this.anInt1370 * -1705054075, 0)) {
				return 0;
			}
			@Pc(24) byte[] local24 = this.aClass359_18.method26713(this.anInt1370 * -1705054075, 0);
			if (local24 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub41_8.aByteArray51 = local24;
			this.aClass3_Sub41_8.anInt2803 = 0;
			local45 = local24.length >> 1;
			this.anIntArray187 = new int[local45];
			for (local51 = 0; local51 < local45; local51++) {
				this.anIntArray187[local51] = this.aClass3_Sub41_8.method20271();
			}
		}
		if (this.anInt1369 * 93738467 >= this.anIntArray187.length) {
			return -1;
		}
		this.method12279();
		this.aClass3_Sub41_8.aByteArray51 = arg0;
		this.aClass3_Sub41_8.anInt2803 = 0;
		do {
			if (this.aClass3_Sub41_8.anInt2803 * 62066237 >= this.aClass3_Sub41_8.aByteArray51.length) {
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub41_9.aByteArray51 == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass3_Sub41_8.aByteArray51 = null;
					return this.aClass3_Sub41_8.anInt2803 * 62066237;
				}
				this.aClass3_Sub41_9.aByteArray51 = this.aByteArrayArray10[0];
			}
			@Pc(133) int local133 = this.aClass3_Sub41_8.aByteArray51.length - this.aClass3_Sub41_8.anInt2803 * 62066237;
			local45 = this.aClass3_Sub41_9.aByteArray51.length - this.aClass3_Sub41_9.anInt2803 * 62066237;
			if (local133 < local45) {
				this.aClass3_Sub41_9.method20286(this.aClass3_Sub41_8.aByteArray51, this.aClass3_Sub41_8.anInt2803 * 62066237, local133);
				this.aClass3_Sub41_8.aByteArray51 = null;
				return arg0.length;
			}
			this.aClass3_Sub41_8.method20248(this.aClass3_Sub41_9.aByteArray51, this.aClass3_Sub41_9.anInt2803 * 62066237, local45);
			this.aClass3_Sub41_9.aByteArray51 = null;
			this.aClass3_Sub41_9.anInt2803 = 0;
			this.anInt1369 += 673945547;
			for (local51 = 0; local51 < 9; local51++) {
				this.aByteArrayArray10[local51] = this.aByteArrayArray10[local51 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anInt1369 * 93738467 < this.anIntArray187.length);
		this.aClass3_Sub41_8.aByteArray51 = null;
		return this.aClass3_Sub41_8.anInt2803 * 62066237;
	}

	@OriginalMember(owner = "client!ahc", name = "bp", descriptor = "(I)V", line = 74)
	public void method12279() {
		if (this.anIntArray187 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < 10 && local6 + this.anInt1369 * 93738467 < this.anIntArray187.length; local6++) {
			if (this.aByteArrayArray10[local6] == null && this.aClass359_18.method26673(this.anIntArray187[local6 + this.anInt1369 * 93738467], 0)) {
				this.aByteArrayArray10[local6] = this.aClass359_18.method26713(this.anIntArray187[local6 + this.anInt1369 * 93738467], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ahc", name = "bd", descriptor = "()V", line = 74)
	public void method12280() {
		if (this.anIntArray187 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < 10 && local6 + this.anInt1369 * 93738467 < this.anIntArray187.length; local6++) {
			if (this.aByteArrayArray10[local6] == null && this.aClass359_18.method26673(this.anIntArray187[local6 + this.anInt1369 * 93738467], 0)) {
				this.aByteArrayArray10[local6] = this.aClass359_18.method26713(this.anIntArray187[local6 + this.anInt1369 * 93738467], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ahc", name = "bs", descriptor = "()V", line = 74)
	public void method12281() {
		if (this.anIntArray187 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < 10 && local6 + this.anInt1369 * 93738467 < this.anIntArray187.length; local6++) {
			if (this.aByteArrayArray10[local6] == null && this.aClass359_18.method26673(this.anIntArray187[local6 + this.anInt1369 * 93738467], 0)) {
				this.aByteArrayArray10[local6] = this.aClass359_18.method26713(this.anIntArray187[local6 + this.anInt1369 * 93738467], 0);
			}
		}
	}
}
