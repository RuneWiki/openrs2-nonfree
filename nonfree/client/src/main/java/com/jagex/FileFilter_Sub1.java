package com.jagex;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajw")
public class FileFilter_Sub1 extends FileFilter {

	@OriginalMember(owner = "client!ajw", name = "g", descriptor = "Lclient!xs;")
	public static Class585 aClass585_1;

	@OriginalMember(owner = "client!ajw", name = "c", descriptor = "I")
	static int anInt2088;

	@OriginalMember(owner = "client!ajw", name = "gk", descriptor = "Lclient!yd;")
	public static Class597 aClass597_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ajw", name = "this$0", descriptor = "Lclient!k;")
	final Class269 this$0;

	@OriginalMember(owner = "client!ajw", name = "p", descriptor = "Lclient!k;")
	Class269 aClass269_1;

	@OriginalMember(owner = "client!ajw", name = "<init>", descriptor = "(Lclient!k;Lclient!k;)V", line = 61)
	FileFilter_Sub1(@OriginalArg(0) Class269 arg0, @OriginalArg(1) Class269 arg1) {
		this.this$0 = arg0;
		this.aClass269_1 = arg1;
	}

	@OriginalMember(owner = "client!ajw", name = "accept", descriptor = "(Ljava/io/File;)Z", line = 66)
	@Override
	public boolean accept(@OriginalArg(0) File arg0) {
		if (this.aClass269_1.method25271() && arg0.isDirectory()) {
			return true;
		} else {
			return !this.aClass269_1.method25271();
		}
	}

	@OriginalMember(owner = "client!ajw", name = "p", descriptor = "(Ljava/io/File;)Z", line = 66)
	public boolean method14702(@OriginalArg(0) File arg0) {
		if (this.aClass269_1.method25271() && arg0.isDirectory()) {
			return true;
		} else {
			return !this.aClass269_1.method25271();
		}
	}

	@OriginalMember(owner = "client!ajw", name = "g", descriptor = "()Ljava/lang/String;", line = 72)
	public String method14701() {
		return null;
	}

	@OriginalMember(owner = "client!ajw", name = "a", descriptor = "()Ljava/lang/String;", line = 72)
	public String method14703() {
		return null;
	}

	@OriginalMember(owner = "client!ajw", name = "getDescription", descriptor = "()Ljava/lang/String;", line = 72)
	@Override
	public String getDescription() {
		return null;
	}

	@OriginalMember(owner = "client!ajw", name = "l", descriptor = "()Ljava/lang/String;", line = 72)
	public String method14704() {
		return null;
	}
}
