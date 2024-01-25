import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class170 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!hv;[Lclient!ug;)V")
	public dxVertexLayout(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class293[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anIk1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class293 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method6709() > local27; local27++) {
				@Pc(37) Class107 local37 = local25.method6711(local27);
				@Pc(47) byte local47;
				@Pc(49) byte local49;
				@Pc(45) int local45;
				if (Static160.aClass107_1 == local37) {
					local47 = 2;
					local49 = 0;
					local45 = 0;
				} else if (Static160.aClass107_2 == local37) {
					local45 = 0;
					local47 = 2;
					local49 = 3;
				} else if (Static160.aClass107_3 == local37) {
					local45 = 0;
					local49 = 10;
					local47 = 4;
				} else if (local37 == Static160.aClass107_4) {
					local47 = 0;
					local49 = 5;
					local45 = local9++;
				} else if (local37 == Static160.aClass107_5) {
					local45 = local9++;
					local47 = 1;
					local49 = 5;
				} else if (local37 == Static160.aClass107_6) {
					local45 = local9++;
					local49 = 5;
					local47 = 2;
				} else {
					local49 = 5;
					local45 = local9++;
					local47 = 3;
				}
				local7.addElement(local11, local47, 0, local49, local45, local21);
				local21 += local37.anInt2918;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
