package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xs")
public class Class585 {

	@OriginalMember(owner = "client!xs", name = "gb", descriptor = "Lclient!hp;")
	public static Class228 aClass228_2;

	@OriginalMember(owner = "client!xs", name = "o", descriptor = "Lclient!ny;")
	static Class359 aClass359_106;

	@OriginalMember(owner = "client!xs", name = "a", descriptor = "Ljava/lang/String;")
	public String aString242;

	@OriginalMember(owner = "client!xs", name = "p", descriptor = "I")
	public int anInt5458;

	@OriginalMember(owner = "client!xs", name = "g", descriptor = "I")
	public int anInt5459 = -332274850;

	@OriginalMember(owner = "client!xs", name = "l", descriptor = "I")
	public int anInt5457 = 1005773703;

	@OriginalMember(owner = "client!xs", name = "h", descriptor = "Z")
	boolean aBoolean841 = true;

	@OriginalMember(owner = "client!xs", name = "x", descriptor = "Z")
	boolean aBoolean842 = false;

	@OriginalMember(owner = "client!xs", name = "p", descriptor = "(B)Ljava/net/Socket;", line = 17)
	public Socket method33272() throws IOException {
		return this.aBoolean842 ? Class559.method32841(this.aString242, this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781).method14636() : new Socket(InetAddress.getByName(this.aString242), this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781);
	}

	@OriginalMember(owner = "client!xs", name = "h", descriptor = "()Ljava/net/Socket;", line = 17)
	public Socket method33276() throws IOException {
		return this.aBoolean842 ? Class559.method32841(this.aString242, this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781).method14636() : new Socket(InetAddress.getByName(this.aString242), this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781);
	}

	@OriginalMember(owner = "client!xs", name = "a", descriptor = "(B)I", line = 22)
	public int method33271() {
		return this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781;
	}

	@OriginalMember(owner = "client!xs", name = "x", descriptor = "()I", line = 22)
	public int method33277() {
		return this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781;
	}

	@OriginalMember(owner = "client!xs", name = "s", descriptor = "()I", line = 22)
	public int method33278() {
		return this.aBoolean841 ? this.anInt5457 * 51946797 : this.anInt5459 * -972357781;
	}

	@OriginalMember(owner = "client!xs", name = "g", descriptor = "(I)V", line = 27)
	public void method33273() {
		if (!this.aBoolean841) {
			this.aBoolean841 = true;
			this.aBoolean842 = true;
		} else if (this.aBoolean842) {
			this.aBoolean842 = false;
		} else {
			this.aBoolean841 = false;
		}
	}

	@OriginalMember(owner = "client!xs", name = "y", descriptor = "()V", line = 27)
	public void method33274() {
		if (!this.aBoolean841) {
			this.aBoolean841 = true;
			this.aBoolean842 = true;
		} else if (this.aBoolean842) {
			this.aBoolean842 = false;
		} else {
			this.aBoolean841 = false;
		}
	}

	@OriginalMember(owner = "client!xs", name = "u", descriptor = "()V", line = 27)
	public void method33279() {
		if (!this.aBoolean841) {
			this.aBoolean841 = true;
			this.aBoolean842 = true;
		} else if (this.aBoolean842) {
			this.aBoolean842 = false;
		} else {
			this.aBoolean841 = false;
		}
	}

	@OriginalMember(owner = "client!xs", name = "l", descriptor = "(Lclient!xs;I)Z", line = 38)
	public boolean method33275(@OriginalArg(0) Class585 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt5458 * 146668341 == arg0.anInt5458 * 146668341 && this.aString242.equals(arg0.aString242);
		}
	}

	@OriginalMember(owner = "client!xs", name = "b", descriptor = "(Lclient!xs;)Z", line = 38)
	public boolean method33280(@OriginalArg(0) Class585 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt5458 * 146668341 == arg0.anInt5458 * 146668341 && this.aString242.equals(arg0.aString242);
		}
	}

	@OriginalMember(owner = "client!xs", name = "ah", descriptor = "(IIIII)Lclient!ane;", line = 53)
	public static Class3_Sub22_Sub2 method33282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub22_Sub2[] local2 = Class3_Sub22_Sub2.aClass3_Sub22_Sub2Array1;
		synchronized (Class3_Sub22_Sub2.aClass3_Sub22_Sub2Array1) {
			@Pc(11) Class3_Sub22_Sub2 local11;
			if (Class134.anInt3383 * 2109755311 == 0) {
				local11 = new Class3_Sub22_Sub2();
			} else {
				local11 = Class3_Sub22_Sub2.aClass3_Sub22_Sub2Array1[(Class134.anInt3383 -= -706189489) * 2109755311];
			}
			local11.anInt2759 = arg0 * 384311683;
			local11.anInt2733 = arg1 * -1707596037;
			local11.anInt2754 = arg2 * -681463111;
			local11.anInt2757 = arg3 * -790897887;
			local11.aLong189 = Class176.method23413() * -6339356479119732283L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!xs", name = "r", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 217)
	static boolean method33281(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Class190.anInt3670 = 1709881008;
		Class615.aClass82_3 = client.aClass82_2;
		return Class65.method13153(false, false, arg0, arg1, -1L);
	}
}
