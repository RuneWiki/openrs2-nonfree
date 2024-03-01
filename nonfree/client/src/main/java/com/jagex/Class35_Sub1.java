package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adi")
public class Class35_Sub1 extends Class35 implements Interface21 {

	@OriginalMember(owner = "client!adi", name = "c", descriptor = "B")
	byte aByte19;

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "(Lclient!akk;Z)V", line = 11)
	Class35_Sub1(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!adi", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method25709() {
		return super.method25709();
	}

	@OriginalMember(owner = "client!adi", name = "u", descriptor = "()I", line = 15)
	@Override
	public int method25706() {
		return super.method25709();
	}

	@OriginalMember(owner = "client!adi", name = "c", descriptor = "()I", line = 15)
	@Override
	public int method25714() {
		return super.method25709();
	}

	@OriginalMember(owner = "client!adi", name = "z", descriptor = "()I", line = 15)
	@Override
	public int method25704() {
		return super.method25709();
	}

	@OriginalMember(owner = "client!adi", name = "ah", descriptor = "()I", line = 19)
	int method7760() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!adi", name = "aa", descriptor = "()I", line = 19)
	int method7761() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!adi", name = "ak", descriptor = "()I", line = 19)
	int method7762() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!adi", name = "an", descriptor = "()I", line = 19)
	int method7763() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!adi", name = "a", descriptor = "(II)Z", line = 23)
	@Override
	public boolean method25688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte19 = (byte) arg1;
		super.method25720(arg0);
		return true;
	}

	@OriginalMember(owner = "client!adi", name = "p", descriptor = "(II)Z", line = 23)
	@Override
	public boolean method25687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte19 = (byte) arg1;
		super.method25720(arg0);
		return true;
	}

	@OriginalMember(owner = "client!adi", name = "g", descriptor = "()V", line = 29)
	@Override
	public void method27209() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adi", name = "y", descriptor = "()V", line = 29)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adi", name = "b", descriptor = "()V", line = 29)
	@Override
	public void method27210() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adi", name = "h", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method25705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method25705(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!adi", name = "j", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method25711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method25705(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!adi", name = "n", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method25712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method25705(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!adi", name = "x", descriptor = "(II)J", line = 37)
	@Override
	public long method25710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method25710(arg0, arg1);
	}

	@OriginalMember(owner = "client!adi", name = "e", descriptor = "(II)J", line = 37)
	@Override
	public long method25713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method25710(arg0, arg1);
	}

	@OriginalMember(owner = "client!adi", name = "r", descriptor = "(II)J", line = 37)
	@Override
	public long method25708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method25710(arg0, arg1);
	}

	@OriginalMember(owner = "client!adi", name = "s", descriptor = "()V", line = 41)
	@Override
	public void method25707() {
		super.method25707();
	}

	@OriginalMember(owner = "client!adi", name = "d", descriptor = "()V", line = 41)
	@Override
	public void method25715() {
		super.method25707();
	}

	@OriginalMember(owner = "client!adi", name = "q", descriptor = "()V", line = 41)
	@Override
	public void method25716() {
		super.method25707();
	}
}
