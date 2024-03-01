package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xz")
public final class Class592 {

	@OriginalMember(owner = "client!xz", name = "p", descriptor = "Ljava/io/RandomAccessFile;")
	RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!xz", name = "a", descriptor = "J")
	final long aLong294;

	@OriginalMember(owner = "client!xz", name = "g", descriptor = "J")
	long aLong295;

	@OriginalMember(owner = "client!xz", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 10)
	public Class592(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong294 = arg2 * 9189402270710196699L;
		this.aLong295 = 0L;
		@Pc(34) int local34 = this.aRandomAccessFile1.read();
		if (local34 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local34);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!xz", name = "x", descriptor = "(J)V", line = 27)
	final void method33343(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong295 = arg0 * 2209434823561214463L;
	}

	@OriginalMember(owner = "client!xz", name = "s", descriptor = "(J)V", line = 27)
	final void method33344(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong295 = arg0 * 2209434823561214463L;
	}

	@OriginalMember(owner = "client!xz", name = "p", descriptor = "(J)V", line = 27)
	final void method33345(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong295 = arg0 * 2209434823561214463L;
	}

	@OriginalMember(owner = "client!xz", name = "u", descriptor = "([BII)V", line = 32)
	public final void method33337(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong295 * 666802148572235263L + (long) arg2 > this.aLong294 * 2518141612084324947L) {
			this.aRandomAccessFile1.seek(this.aLong294 * 2518141612084324947L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong295 += (long) arg2 * 2209434823561214463L;
		}
	}

	@OriginalMember(owner = "client!xz", name = "a", descriptor = "([BIIB)V", line = 32)
	public final void method33338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong295 * 666802148572235263L + (long) arg2 > this.aLong294 * 2518141612084324947L) {
			this.aRandomAccessFile1.seek(this.aLong294 * 2518141612084324947L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong295 += (long) arg2 * 2209434823561214463L;
		}
	}

	@OriginalMember(owner = "client!xz", name = "y", descriptor = "([BII)V", line = 32)
	public final void method33347(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong295 * 666802148572235263L + (long) arg2 > this.aLong294 * 2518141612084324947L) {
			this.aRandomAccessFile1.seek(this.aLong294 * 2518141612084324947L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong295 += (long) arg2 * 2209434823561214463L;
		}
	}

	@OriginalMember(owner = "client!xz", name = "b", descriptor = "([BII)V", line = 32)
	public final void method33348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong295 * 666802148572235263L + (long) arg2 > this.aLong294 * 2518141612084324947L) {
			this.aRandomAccessFile1.seek(this.aLong294 * 2518141612084324947L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong295 += (long) arg2 * 2209434823561214463L;
		}
	}

	@OriginalMember(owner = "client!xz", name = "g", descriptor = "(B)V", line = 42)
	public final void method33339() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!xz", name = "l", descriptor = "(B)J", line = 49)
	public final long method33340() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!xz", name = "c", descriptor = "()J", line = 49)
	public final long method33346() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!xz", name = "z", descriptor = "()J", line = 49)
	public final long method33349() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!xz", name = "h", descriptor = "([BIII)I", line = 53)
	public final int method33341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong295 += (long) local6 * 2209434823561214463L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!xz", name = "finalize", descriptor = "()V", line = 59)
	@Override
	void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method33339();
		}
	}

	@OriginalMember(owner = "client!xz", name = "hh", descriptor = "()V", line = 59)
	void method33342() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method33339();
		}
	}

	@OriginalMember(owner = "client!xz", name = "y", descriptor = "(B)Lclient!wv;", line = 121)
	public static Class563 method33351() {
		return Class338.aClass563_1 == null ? Class563.aClass563_2 : Class338.aClass563_1;
	}

	@OriginalMember(owner = "client!xz", name = "v", descriptor = "(Lclient!de;I)V", line = 582)
	static void method33350(@OriginalArg(0) Class21 arg0) {
		if (Class250.aClass328_97 != null) {
			arg0.method17322(Class250.aClass328_97);
			arg0.method17106(Class250.aClass332_53);
			arg0.method17079(Class250.anInt3814 * 526030743, Class250.anInt3815 * -2061516899, Class250.anInt3805 * 1138137437 + Class250.anInt3814 * 526030743, Class250.anInt3815 * -2061516899 + Class250.anInt3817 * -981714459);
			arg0.method17054(Class250.anInt3814 * 526030743, Class250.anInt3815 * -2061516899, Class250.anInt3805 * 1138137437, Class250.anInt3817 * -981714459);
		}
	}
}
