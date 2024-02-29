package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class Class360 {

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
	int anInt4505;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	int anInt4506;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	int anInt4508;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	int anInt4509 = 128;

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	int anInt4507 = 128;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	int anInt4510;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 11)
	Class360(@OriginalArg(0) int arg0) {
		this.anInt4510 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V", line = 15)
	Class360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4510 = arg0;
		this.anInt4509 = arg1;
		this.anInt4507 = arg2;
		this.anInt4508 = arg3;
		this.anInt4505 = arg4;
		this.anInt4506 = arg5;
	}

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "()Lclient!ke;", line = 25)
	Class360 method28001() {
		return new Class360(this.anInt4510, this.anInt4509, this.anInt4507, this.anInt4508, this.anInt4505, this.anInt4506);
	}

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "()Lclient!ke;", line = 25)
	Class360 method28002() {
		return new Class360(this.anInt4510, this.anInt4509, this.anInt4507, this.anInt4508, this.anInt4505, this.anInt4506);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(Lclient!ke;)V", line = 29)
	void method28003(@OriginalArg(0) Class360 arg0) {
		this.anInt4509 = arg0.anInt4509;
		this.anInt4507 = arg0.anInt4507;
		this.anInt4508 = arg0.anInt4508;
		this.anInt4505 = arg0.anInt4505;
		this.anInt4510 = arg0.anInt4510;
		this.anInt4506 = arg0.anInt4506;
	}

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "(Lclient!ke;)V", line = 29)
	void method28004(@OriginalArg(0) Class360 arg0) {
		this.anInt4509 = arg0.anInt4509;
		this.anInt4507 = arg0.anInt4507;
		this.anInt4508 = arg0.anInt4508;
		this.anInt4505 = arg0.anInt4505;
		this.anInt4510 = arg0.anInt4510;
		this.anInt4506 = arg0.anInt4506;
	}
}
