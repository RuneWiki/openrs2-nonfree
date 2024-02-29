package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ata")
public class Class77_Sub1_Sub18_Sub1 extends Class77_Sub1_Sub18 {

	@OriginalMember(owner = "client!ata", name = "d", descriptor = "Ljava/util/concurrent/Future;")
	Future aFuture1;

	@OriginalMember(owner = "client!ata", name = "s", descriptor = "I")
	final int anInt3190;

	@OriginalMember(owner = "client!ata", name = "<init>", descriptor = "(I)V", line = 9)
	Class77_Sub1_Sub18_Sub1(@OriginalArg(0) int arg0) {
		this.anInt3190 = arg0 * 1493378277;
	}

	@OriginalMember(owner = "client!ata", name = "x", descriptor = "(Ljava/util/concurrent/Future;B)V", line = 14)
	void method23654(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!ata", name = "g", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method23655(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!ata", name = "d", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method23656(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!ata", name = "s", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method23657(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!ata", name = "r", descriptor = "(Ljava/util/concurrent/Future;)V", line = 14)
	void method23658(@OriginalArg(0) Future arg0) {
		this.aFuture1 = arg0;
	}

	@OriginalMember(owner = "client!ata", name = "y", descriptor = "()[B", line = 18)
	@Override
	byte[] method24037() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class480) this.aFuture1.get()).method29814();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ata", name = "v", descriptor = "()[B", line = 18)
	@Override
	byte[] method24032() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class480) this.aFuture1.get()).method29814();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ata", name = "l", descriptor = "()[B", line = 18)
	@Override
	byte[] method24036() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class480) this.aFuture1.get()).method29814();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ata", name = "p", descriptor = "(S)[B", line = 18)
	@Override
	byte[] method24033() {
		if (this.aFuture1.isDone()) {
			try {
				return ((Class480) this.aFuture1.get()).method29814();
			} catch (@Pc(11) InterruptedException local11) {
				local11.printStackTrace();
			} catch (@Pc(15) ExecutionException local15) {
				local15.printStackTrace();
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ata", name = "c", descriptor = "(I)I", line = 33)
	@Override
	int method24034() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "w", descriptor = "()I", line = 33)
	@Override
	int method24035() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "t", descriptor = "()I", line = 33)
	@Override
	int method24038() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "q", descriptor = "()I", line = 33)
	@Override
	int method24039() {
		if (this.aFuture1 == null) {
			return 0;
		} else if (this.aFuture1.isDone()) {
			return 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "uz", descriptor = "(Lclient!yf;I)V", line = 8266)
	static final void method23659(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		Class94_Sub4.aClass261_1.method26292(local13);
	}
}
