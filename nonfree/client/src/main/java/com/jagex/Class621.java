package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zj")
public class Class621 implements Interface3 {

	@OriginalMember(owner = "client!zj", name = "a", descriptor = "Lclient!ew;")
	final Class161 aClass161_73 = new Class161(64);

	@OriginalMember(owner = "client!zj", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_115;

	@OriginalMember(owner = "client!zj", name = "p", descriptor = "(Ljava/io/File;[BII)V", line = 11)
	static void method33759(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!zj", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;)V", line = 15)
	public Class621(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2) {
		this.aClass359_115 = arg2;
		this.aClass359_115.method26682(Class185.aClass185_11.anInt3631 * -1739932335);
	}

	@OriginalMember(owner = "client!zj", name = "p", descriptor = "(II)Lclient!za;", line = 22)
	public Class3_Sub1_Sub19 method33757(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_73;
		@Pc(11) Class3_Sub1_Sub19 local11;
		synchronized (this.aClass161_73) {
			local11 = (Class3_Sub1_Sub19) this.aClass161_73.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_115;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_115) {
			local39 = this.aClass359_115.method26713(Class185.aClass185_11.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class3_Sub1_Sub19();
		if (local39 != null) {
			local11.method33679(new Class3_Sub41(local39));
		}
		@Pc(64) Class161 local64 = this.aClass161_73;
		synchronized (this.aClass161_73) {
			this.aClass161_73.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!zj", name = "ab", descriptor = "(Lclient!vs;I)V", line = 4116)
	static final void method33758(@OriginalArg(0) Class536 arg0) {
		@Pc(7) int local7 = arg0.anIntArray497[arg0.anInt5318 * -2140198955];
		@Pc(20) int local20 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local20 < 0 || local20 >= arg0.anIntArray495[local7]) {
			throw new RuntimeException();
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.anIntArrayArray62[local7][local20];
	}

	@OriginalMember(owner = "client!zj", name = "se", descriptor = "(Lclient!vs;I)V", line = 7344)
	static final void method33760(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3517 * -1321366055;
	}
}
