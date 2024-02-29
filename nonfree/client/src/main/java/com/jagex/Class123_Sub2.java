package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahz")
public class Class123_Sub2 extends Class123 implements Interface38 {

	@OriginalMember(owner = "client!ahz", name = "s", descriptor = "Lclient!dl;")
	Class206 aClass206_16;

	@OriginalMember(owner = "client!ahz", name = "<init>", descriptor = "(Lclient!apr;Lclient!dl;Z)V", line = 12)
	Class123_Sub2(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass206_16 = arg1;
	}

	@OriginalMember(owner = "client!ahz", name = "x", descriptor = "()I", line = 17)
	@Override
	public int method28747() {
		return super.method28754();
	}

	@OriginalMember(owner = "client!ahz", name = "d", descriptor = "()I", line = 17)
	@Override
	public int method28744() {
		return super.method28754();
	}

	@OriginalMember(owner = "client!ahz", name = "z", descriptor = "()I", line = 17)
	@Override
	public int method28753() {
		return super.method28754();
	}

	@OriginalMember(owner = "client!ahz", name = "y", descriptor = "()I", line = 17)
	@Override
	public int method28754() {
		return super.method28754();
	}

	@OriginalMember(owner = "client!ahz", name = "c", descriptor = "()Lclient!dl;", line = 21)
	@Override
	public Class206 method28729() {
		return this.aClass206_16;
	}

	@OriginalMember(owner = "client!ahz", name = "p", descriptor = "()Lclient!dl;", line = 21)
	@Override
	public Class206 method28727() {
		return this.aClass206_16;
	}

	@OriginalMember(owner = "client!ahz", name = "o", descriptor = "(I)V", line = 25)
	@Override
	public void method28728(@OriginalArg(0) int arg0) {
		super.method28728(arg0 * this.aClass206_16.anInt3581 * 1899960707);
	}

	@OriginalMember(owner = "client!ahz", name = "b", descriptor = "(I)V", line = 25)
	@Override
	public void method28730(@OriginalArg(0) int arg0) {
		super.method28728(arg0 * this.aClass206_16.anInt3581 * 1899960707);
	}

	@OriginalMember(owner = "client!ahz", name = "r", descriptor = "()V", line = 29)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahz", name = "v", descriptor = "()V", line = 29)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahz", name = "s", descriptor = "()V", line = 29)
	@Override
	public void method30320() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahz", name = "g", descriptor = "()V", line = 29)
	@Override
	public void method30319() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahz", name = "j", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method28750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method28755(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahz", name = "w", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method28755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method28755(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahz", name = "i", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method28751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method28755(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahz", name = "k", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method28752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method28755(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ahz", name = "u", descriptor = "(II)J", line = 37)
	@Override
	public long method28749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method28745(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahz", name = "t", descriptor = "(II)J", line = 37)
	@Override
	public long method28745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method28745(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahz", name = "e", descriptor = "()V", line = 41)
	@Override
	public void method28748() {
		super.method28746();
	}

	@OriginalMember(owner = "client!ahz", name = "f", descriptor = "()V", line = 41)
	@Override
	public void method28743() {
		super.method28746();
	}

	@OriginalMember(owner = "client!ahz", name = "q", descriptor = "()V", line = 41)
	@Override
	public void method28746() {
		super.method28746();
	}
}
