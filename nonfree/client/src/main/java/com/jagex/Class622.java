package com.jagex;

import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zl")
public class Class622 {

	@OriginalMember(owner = "client!zl", name = "hj", descriptor = "Lclient!xm;")
	public static Class580 aClass580_2;

	@OriginalMember(owner = "client!zl", name = "p", descriptor = "Ljava/util/zip/Inflater;")
	Inflater anInflater1;

	@OriginalMember(owner = "client!zl", name = "<init>", descriptor = "()V", line = 10)
	public Class622() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!zl", name = "<init>", descriptor = "(III)V", line = 13)
	Class622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!zl", name = "p", descriptor = "([BI)[B", line = 16)
	public byte[] method33761(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		local4.anInt2803 = (arg0.length - 4) * -918980331;
		@Pc(16) int local16 = local4.method20412();
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt2803 = 0;
		this.method33762(local4, local19);
		return local19;
	}

	@OriginalMember(owner = "client!zl", name = "a", descriptor = "(Lclient!ahb;[BI)V", line = 26)
	public void method33762(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray51[arg0.anInt2803 * 62066237] != 31 || arg0.aByteArray51[arg0.anInt2803 * 62066237 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray51, arg0.anInt2803 * 62066237 + 10, arg0.aByteArray51.length - (8 + 10 + arg0.anInt2803 * 62066237));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!zl", name = "g", descriptor = "(Lclient!ahb;[B)V", line = 26)
	public void method33763(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray51[arg0.anInt2803 * 62066237] != 31 || arg0.aByteArray51[arg0.anInt2803 * 62066237 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray51, arg0.anInt2803 * 62066237 + 10, arg0.aByteArray51.length - (8 + 10 + arg0.anInt2803 * 62066237));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("");
		}
		this.anInflater1.reset();
	}
}
