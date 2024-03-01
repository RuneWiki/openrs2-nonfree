package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "p", descriptor = "()I")
	int p();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "a", descriptor = "()J")
	long a();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "g", descriptor = "([BIII)V")
	void g(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "l", descriptor = "([BIII)V")
	void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "h", descriptor = "([BIII)V")
	void h(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "x", descriptor = "([BIII)V")
	void x(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "s", descriptor = "()I")
	int s();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "u", descriptor = "()I")
	int u();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "y", descriptor = "()I")
	int y();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "b", descriptor = "()J")
	long b();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "c", descriptor = "()J")
	long c();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "z", descriptor = "()J")
	long z();
}
