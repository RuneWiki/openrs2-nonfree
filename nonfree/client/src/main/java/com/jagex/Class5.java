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

@OriginalClass("client!aad")
public final class Class5 {

	@OriginalMember(owner = "client!aad", name = "as", descriptor = "I")
	static int anInt18;

	@OriginalMember(owner = "client!aad", name = "<init>", descriptor = "()V", line = 6)
	Class5() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aad", name = "w", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method42(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!aad", name = "l", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method43(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!aad", name = "y", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method44(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!aad", name = "t", descriptor = "(Ljava/io/File;[BI)V", line = 11)
	static void method45(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!aad", name = "q", descriptor = "(Ljava/io/File;I)[B", line = 21)
	static byte[] method46(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class567.method31380(arg0, local2, arg1);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aad", name = "x", descriptor = "(Ljava/io/File;I)[B", line = 21)
	static byte[] method47(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class567.method31380(arg0, local2, arg1);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aad", name = "re", descriptor = "(Lclient!yf;I)V", line = 7796)
	static final void method48(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3872 * -1196182029;
	}
}
