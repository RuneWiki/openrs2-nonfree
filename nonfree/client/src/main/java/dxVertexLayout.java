import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class76 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!rca;[Lclient!ck;)V")
	public dxVertexLayout(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class50[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aCv1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class50 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method1234() > local27; local27++) {
				@Pc(37) Class144 local37 = local25.method1232(local27);
				@Pc(47) byte local47;
				@Pc(45) byte local45;
				@Pc(49) int local49;
				if (local37 == Static218.aClass144_1) {
					local49 = 0;
					local47 = 2;
					local45 = 0;
				} else if (Static218.aClass144_2 == local37) {
					local45 = 3;
					local47 = 2;
					local49 = 0;
				} else if (local37 == Static218.aClass144_3) {
					local47 = 4;
					local49 = 0;
					local45 = 10;
				} else if (Static218.aClass144_4 == local37) {
					local45 = 5;
					local49 = local9++;
					local47 = 0;
				} else if (Static218.aClass144_5 == local37) {
					local47 = 1;
					local45 = 5;
					local49 = local9++;
				} else if (local37 == Static218.aClass144_6) {
					local49 = local9++;
					local45 = 5;
					local47 = 2;
				} else {
					local49 = local9++;
					local47 = 3;
					local45 = 5;
				}
				local7.addElement(local11, local47, 0, local45, local49, local21);
				local21 += local37.anInt4760;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
