import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class28 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!tga;[Lclient!oc;)V")
	public dxVertexLayout(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class231[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aDj1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class231 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method5422(); local23++) {
				@Pc(33) Class210 local33 = local21.method5421(local23);
				@Pc(41) byte local41;
				@Pc(45) byte local45;
				@Pc(43) int local43;
				if (Static321.aClass210_1 == local33) {
					local45 = 0;
					local43 = 0;
					local41 = 2;
				} else if (Static321.aClass210_2 == local33) {
					local41 = 2;
					local43 = 0;
					local45 = 3;
				} else if (local33 == Static321.aClass210_3) {
					local43 = 0;
					local45 = 10;
					local41 = 4;
				} else if (Static321.aClass210_4 == local33) {
					local45 = 5;
					local41 = 0;
					local43 = local9++;
				} else if (Static321.aClass210_5 == local33) {
					local45 = 5;
					local43 = local9++;
					local41 = 1;
				} else if (local33 == Static321.aClass210_6) {
					local43 = local9++;
					local41 = 2;
					local45 = 5;
				} else {
					local45 = 5;
					local41 = 3;
					local43 = local9++;
				}
				local7.addElement(local11, local41, 0, local45, local43, local17);
				local17 += local33.anInt5876;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
