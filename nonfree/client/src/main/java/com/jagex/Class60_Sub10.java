package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aid")
public class Class60_Sub10 extends Class60 {

	@OriginalMember(owner = "client!aid", name = "tk", descriptor = "I")
	static int anInt1865;

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "Z")
	boolean aBoolean339 = true;

	@OriginalMember(owner = "client!aid", name = "s", descriptor = "Z")
	public boolean aBoolean338 = false;

	@OriginalMember(owner = "client!aid", name = "<init>", descriptor = "(Lclient!aht;)V", line = 13)
	public Class60_Sub10(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aid", name = "<init>", descriptor = "(ILclient!aht;)V", line = 17)
	public Class60_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aid", name = "v", descriptor = "(I)V", line = 21)
	public void method13368() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 5 || this.anInt2079 * -1373670555 == 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aid", name = "f", descriptor = "()V", line = 21)
	public void method13369() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 5 || this.anInt2079 * -1373670555 == 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aid", name = "k", descriptor = "()V", line = 21)
	public void method13374() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 5 || this.anInt2079 * -1373670555 == 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aid", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		this.aBoolean338 = true;
		return this.aClass3_Sub45_36.method13003().method32855() ? 3 : 1;
	}

	@OriginalMember(owner = "client!aid", name = "t", descriptor = "(I)Z", line = 31)
	public boolean method13372() {
		return true;
	}

	@OriginalMember(owner = "client!aid", name = "a", descriptor = "(IB)I", line = 35)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class289.method25518().method27790("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!aid", name = "c", descriptor = "(I)I", line = 35)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class289.method25518().method27790("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!aid", name = "z", descriptor = "(I)I", line = 35)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class289.method25518().method27790("jagdx") ? 3 : 2;
	}

	@OriginalMember(owner = "client!aid", name = "l", descriptor = "(IB)V", line = 40)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.aBoolean338 = false;
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aid", name = "j", descriptor = "(I)V", line = 40)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.aBoolean338 = false;
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aid", name = "n", descriptor = "(I)V", line = 40)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.aBoolean338 = false;
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aid", name = "w", descriptor = "(B)I", line = 45)
	public int method13373() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aid", name = "at", descriptor = "()I", line = 45)
	public int method13375() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aid", name = "af", descriptor = "()I", line = 45)
	public int method13376() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aid", name = "o", descriptor = "(I)Z", line = 49)
	boolean method13371() {
		return this.aBoolean339;
	}

	@OriginalMember(owner = "client!aid", name = "ak", descriptor = "()Z", line = 49)
	boolean method13377() {
		return this.aBoolean339;
	}

	@OriginalMember(owner = "client!aid", name = "i", descriptor = "(ZB)V", line = 53)
	public void method13370(@OriginalArg(0) boolean arg0) {
		this.aBoolean339 = arg0;
	}

	@OriginalMember(owner = "client!aid", name = "aa", descriptor = "(Z)V", line = 53)
	public void method13378(@OriginalArg(0) boolean arg0) {
		this.aBoolean339 = arg0;
	}

	@OriginalMember(owner = "client!aid", name = "ah", descriptor = "(Z)V", line = 53)
	public void method13379(@OriginalArg(0) boolean arg0) {
		this.aBoolean339 = arg0;
	}
}
