package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public class Class433 {

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList3 = new LinkedList();

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 15)
	Class433() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "(Lclient!ahw;)V", line = 20)
	public static void method27978(@OriginalArg(0) Class64_Sub1 arg0) {
		Class293.method25561(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 24)
	public static void method27967(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class424(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 24)
	public static void method27979(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class424(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "(I)V", line = 28)
	public static void method27970(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class441(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "(I)V", line = 28)
	public static void method27971(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class441(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "(I)V", line = 28)
	public static void method27973(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class441(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(Lclient!yj;)V", line = 32)
	public static void method27972(@OriginalArg(0) Class600 arg0) {
		Class293.method25561(new Class425(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(Lclient!yj;)V", line = 32)
	public static void method27974(@OriginalArg(0) Class600 arg0) {
		Class293.method25561(new Class425(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "(Lclient!yj;)V", line = 32)
	public static void method27975(@OriginalArg(0) Class600 arg0) {
		Class293.method25561(new Class425(arg0));
	}

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "(III)V", line = 36)
	public static void method27976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class293.method25561(new Class66_Sub1(arg0, arg1, arg2, client.anInt3087 * -1664017337, Class117.aClass51_2.anInt1113 * -1998186295, Class117.aClass51_2.anInt1115 * 196916579, Class117.aClass51_2.method9820(), Class117.aClass51_2.method9819(), Class398.aClass347_3.method26523()));
	}

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "(Lclient!ym;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 40)
	public static void method27977(@OriginalArg(0) Class603 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		Class293.method25561(new Class430(arg0, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "(Lclient!rh;)V", line = 44)
	static void method27968(@OriginalArg(0) Interface47 arg0) {
		while (aLinkedList3.size() > 10) {
			aLinkedList3.remove();
		}
		aLinkedList3.add(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "()V", line = 49)
	public static void method27969() {
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 7 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface47 local16 = (Interface47) aLinkedList3.poll();
			if (local16 == null) {
				return;
			}
			local16.method28244();
		}
	}

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "()V", line = 49)
	public static void method27980() {
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 7 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface47 local16 = (Interface47) aLinkedList3.poll();
			if (local16 == null) {
				return;
			}
			local16.method28244();
		}
	}

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "()V", line = 49)
	public static void method27981() {
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 7 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface47 local16 = (Interface47) aLinkedList3.poll();
			if (local16 == null) {
				return;
			}
			local16.method28244();
		}
	}

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "()V", line = 49)
	public static void method27982() {
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 7 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface47 local16 = (Interface47) aLinkedList3.poll();
			if (local16 == null) {
				return;
			}
			local16.method28244();
		}
	}
}
