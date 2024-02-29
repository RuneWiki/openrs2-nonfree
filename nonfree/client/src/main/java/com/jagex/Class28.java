package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abb")
public final class Class28 {

	@OriginalMember(owner = "client!abb", name = "p", descriptor = "Ljava/io/RandomAccessFile;")
	RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!abb", name = "c", descriptor = "J")
	final long aLong5;

	@OriginalMember(owner = "client!abb", name = "v", descriptor = "J")
	long aLong4;

	@OriginalMember(owner = "client!abb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 10)
	public Class28(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.aRandomAccessFile1 = new RandomAccessFile(arg0, arg1);
		this.aLong5 = arg2 * -5599458437878436289L;
		this.aLong4 = 0L;
		@Pc(34) int local34 = this.aRandomAccessFile1.read();
		if (local34 != -1 && !arg1.equals("r")) {
			this.aRandomAccessFile1.seek(0L);
			this.aRandomAccessFile1.write(local34);
		}
		this.aRandomAccessFile1.seek(0L);
	}

	@OriginalMember(owner = "client!abb", name = "p", descriptor = "(J)V", line = 27)
	final void method471(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong4 = arg0 * 8498401344032027077L;
	}

	@OriginalMember(owner = "client!abb", name = "w", descriptor = "(J)V", line = 27)
	final void method472(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong4 = arg0 * 8498401344032027077L;
	}

	@OriginalMember(owner = "client!abb", name = "t", descriptor = "(J)V", line = 27)
	final void method473(@OriginalArg(0) long arg0) throws IOException {
		this.aRandomAccessFile1.seek(arg0);
		this.aLong4 = arg0 * 8498401344032027077L;
	}

	@OriginalMember(owner = "client!abb", name = "q", descriptor = "([BII)V", line = 32)
	public final void method474(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong4 * 2690672414746551565L + (long) arg2 > this.aLong5 * -8787716330816028225L) {
			this.aRandomAccessFile1.seek(this.aLong5 * -8787716330816028225L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong4 += (long) arg2 * 8498401344032027077L;
		}
	}

	@OriginalMember(owner = "client!abb", name = "c", descriptor = "([BIII)V", line = 32)
	public final void method475(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aLong4 * 2690672414746551565L + (long) arg2 > this.aLong5 * -8787716330816028225L) {
			this.aRandomAccessFile1.seek(this.aLong5 * -8787716330816028225L);
			this.aRandomAccessFile1.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile1.write(arg0, arg1, arg2);
			this.aLong4 += (long) arg2 * 8498401344032027077L;
		}
	}

	@OriginalMember(owner = "client!abb", name = "v", descriptor = "(I)V", line = 42)
	public final void method476() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!abb", name = "x", descriptor = "()V", line = 42)
	public final void method477() throws IOException {
		if (this.aRandomAccessFile1 != null) {
			this.aRandomAccessFile1.close();
			this.aRandomAccessFile1 = null;
		}
	}

	@OriginalMember(owner = "client!abb", name = "l", descriptor = "(I)J", line = 49)
	public final long method478() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abb", name = "g", descriptor = "()J", line = 49)
	public final long method479() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abb", name = "r", descriptor = "()J", line = 49)
	public final long method480() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abb", name = "d", descriptor = "()J", line = 49)
	public final long method481() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abb", name = "s", descriptor = "()J", line = 49)
	public final long method482() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abb", name = "z", descriptor = "()J", line = 49)
	public final long method483() throws IOException {
		return this.aRandomAccessFile1.length();
	}

	@OriginalMember(owner = "client!abb", name = "u", descriptor = "([BII)I", line = 53)
	public final int method484(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "k", descriptor = "([BII)I", line = 53)
	public final int method485(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "y", descriptor = "([BIII)I", line = 53)
	public final int method486(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "i", descriptor = "([BII)I", line = 53)
	public final int method487(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "j", descriptor = "([BII)I", line = 53)
	public final int method488(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "b", descriptor = "([BII)I", line = 53)
	public final int method489(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "e", descriptor = "([BII)I", line = 53)
	public final int method490(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "f", descriptor = "([BII)I", line = 53)
	public final int method491(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "o", descriptor = "([BII)I", line = 53)
	public final int method492(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.aRandomAccessFile1.read(arg0, arg1, arg2);
		if (local6 > 0) {
			this.aLong4 += (long) local6 * 8498401344032027077L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!abb", name = "p", descriptor = "(I)[Lclient!abp;", line = 53)
	public static Class40[] method493() {
		return new Class40[] { Class40.aClass40_13, Class40.aClass40_2, Class40.aClass40_3, Class40.aClass40_4, Class40.aClass40_5, Class40.aClass40_6, Class40.aClass40_24, Class40.aClass40_38, Class40.aClass40_9, Class40.aClass40_11, Class40.aClass40_10, Class40.aClass40_12, Class40.aClass40_17, Class40.aClass40_1, Class40.aClass40_15, Class40.aClass40_16, Class40.aClass40_27, Class40.aClass40_25, Class40.aClass40_19, Class40.aClass40_20, Class40.aClass40_21, Class40.aClass40_22, Class40.aClass40_23, Class40.aClass40_40, Class40.aClass40_31, Class40.aClass40_26, Class40.aClass40_43, Class40.aClass40_28, Class40.aClass40_29, Class40.aClass40_30, Class40.aClass40_35, Class40.aClass40_32, Class40.aClass40_33, Class40.aClass40_34, Class40.aClass40_42, Class40.aClass40_36, Class40.aClass40_37, Class40.aClass40_14, Class40.aClass40_7, Class40.aClass40_39, Class40.aClass40_41, Class40.aClass40_18, Class40.aClass40_8 };
	}

	@OriginalMember(owner = "client!abb", name = "hd", descriptor = "()V", line = 59)
	void method494() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method476();
		}
	}

	@OriginalMember(owner = "client!abb", name = "hp", descriptor = "()V", line = 59)
	void method495() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method476();
		}
	}

	@OriginalMember(owner = "client!abb", name = "finalize", descriptor = "()V", line = 59)
	@Override
	void finalize() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method476();
		}
	}

	@OriginalMember(owner = "client!abb", name = "hc", descriptor = "()V", line = 59)
	void method496() throws Throwable {
		if (this.aRandomAccessFile1 != null) {
			System.out.println("");
			this.method476();
		}
	}

	@OriginalMember(owner = "client!abb", name = "j", descriptor = "(B)V", line = 339)
	static void method497() {
	}
}
