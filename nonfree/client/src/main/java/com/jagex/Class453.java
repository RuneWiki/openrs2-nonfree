package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class Class453 {

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Lclient!ot;")
	public Class452 aClass452_5 = new Class452();

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!oo;")
	public Class447 aClass447_61 = new Class447();

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V", line = 7)
	public Class453() {
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ou;)V", line = 12)
	public Class453(@OriginalArg(0) Class453 arg0) {
		this.method29348(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "(Lclient!ou;)V", line = 19)
	public void method29348(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29286(arg0.aClass452_5);
		this.aClass447_61.method29136(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "(Lclient!ou;)V", line = 19)
	public void method29349(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29286(arg0.aClass452_5);
		this.aClass447_61.method29136(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "(Lclient!ou;)V", line = 19)
	public void method29350(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29286(arg0.aClass452_5);
		this.aClass447_61.method29136(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "(Lclient!ou;)V", line = 19)
	public void method29351(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29286(arg0.aClass452_5);
		this.aClass447_61.method29136(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "()V", line = 24)
	public final void method29352() {
		this.aClass452_5.method29307();
		this.aClass447_61.method29144();
		this.aClass447_61.method29198(this.aClass452_5);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "()V", line = 24)
	public final void method29353() {
		this.aClass452_5.method29307();
		this.aClass447_61.method29144();
		this.aClass447_61.method29198(this.aClass452_5);
	}

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "()V", line = 24)
	public final void method29354() {
		this.aClass452_5.method29307();
		this.aClass447_61.method29144();
		this.aClass447_61.method29198(this.aClass452_5);
	}

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "()V", line = 24)
	public final void method29355() {
		this.aClass452_5.method29307();
		this.aClass447_61.method29144();
		this.aClass447_61.method29198(this.aClass452_5);
	}

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "()V", line = 24)
	public final void method29356() {
		this.aClass452_5.method29307();
		this.aClass447_61.method29144();
		this.aClass447_61.method29198(this.aClass452_5);
	}

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "(Lclient!ou;)V", line = 30)
	public final void method29357(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29330(arg0.aClass452_5);
		this.aClass447_61.method29198(arg0.aClass452_5);
		this.aClass447_61.method29146(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "(Lclient!ou;)V", line = 30)
	public final void method29358(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29330(arg0.aClass452_5);
		this.aClass447_61.method29198(arg0.aClass452_5);
		this.aClass447_61.method29146(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "(Lclient!ou;)V", line = 30)
	public final void method29359(@OriginalArg(0) Class453 arg0) {
		this.aClass452_5.method29330(arg0.aClass452_5);
		this.aClass447_61.method29198(arg0.aClass452_5);
		this.aClass447_61.method29146(arg0.aClass447_61);
	}

	@OriginalMember(owner = "client!ou", name = "rs", descriptor = "()Ljava/lang/String;", line = 37)
	public String method29360() {
		return "[" + this.aClass452_5.toString() + "|" + this.aClass447_61.toString() + "]";
	}

	@OriginalMember(owner = "client!ou", name = "ro", descriptor = "()Ljava/lang/String;", line = 37)
	public String method29361() {
		return "[" + this.aClass452_5.toString() + "|" + this.aClass447_61.toString() + "]";
	}

	@OriginalMember(owner = "client!ou", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
	@Override
	public String toString() {
		return "[" + this.aClass452_5.toString() + "|" + this.aClass447_61.toString() + "]";
	}
}
